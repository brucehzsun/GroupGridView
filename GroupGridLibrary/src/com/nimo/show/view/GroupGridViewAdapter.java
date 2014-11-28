
package com.nimo.show.view;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public abstract class GroupGridViewAdapter extends BaseAdapter {

    private static final String TAG = "GroupGridViewAdapter";

    private ArrayList<RowItem> mRowList;

    private LayoutInflater mInflater;

    private int curPosition;

    public GroupGridViewAdapter(Context context, ArrayList<IGroupItem> groups) {
        mInflater = LayoutInflater.from(context);
        mRowList = DataUtils.formatData(groups);

    }

    @Override
    public int getCount() {
        if (mRowList == null)
            return 0;

        return mRowList.size();
    }

    @Override
    public Object getItem(int position) {
        return mRowList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * 如果类型比较多,需要复写;
     */
    @Override
    public int getItemViewType(int position) {
        if (mRowList == null) {
            return -1;
        }
        RowItem item = mRowList.get(position);
        return item.getShowStyle();
    }

    @Override
    public int getViewTypeCount() {
        return 6;// 5+1
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (mRowList == null) {
            return null;
        }

        RowItem item = mRowList.get(position);
        if (item.isGroup()) {
            Log.i(TAG, item.getGroupItem().getName() + " groupPosition = "
                    + item.getGroupItem().getGroupPosition());
        } else {
            for (int j = 0; j < item.getColumnItems().size(); j++) {
                Log.d(TAG, "groupPosition = " + item.getColumnItems().get(j).getGroupPosition()
                        + ", childPosition = " + item.getColumnItems().get(j).getChildPosition());
            }
        }

        switch (item.getShowStyle()) {
            case 1:// 2中图
                convertView = getTwoMidPicView(convertView, item, parent.getWidth());
                break;
            case 2:// 1大2小
                convertView = getBigAndSmallPicView(convertView, item, parent.getWidth());
                break;
            case 3:// 两个长方图
                convertView = getTwoRectPicView(convertView, item, parent.getWidth());
                break;
            case 4:// group title;
                convertView = getGroupTitle(convertView, item, parent.getWidth());
                break;
            case 0:
            default:
                // 9宫格
                convertView = getThreePicView(convertView, item, parent.getWidth());
                break;
        }

        return convertView;
    }

    private View getTwoMidPicView(View convertView, RowItem item, int width) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.two_mid_pic_layout, null);
            holder = new ViewHolder();
            holder.firstLayout = (RelativeLayout) convertView.findViewById(R.id.firstLayout);
            holder.secondLayout = (RelativeLayout) convertView.findViewById(R.id.secondLayout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        List<IChildItem> picItems = item.getColumnItems();
        LayoutParams params = new LayoutParams(width / 2, width / 2);
        holder.firstLayout.setLayoutParams(params);
        holder.secondLayout.setLayoutParams(params);

        IChildItem firstChild = picItems.get(0);
        getMiddelView(holder.firstLayout, firstChild.getGroupPosition(),
                firstChild.getChildPosition(), firstChild);

        IChildItem secondChild = null;
        if (picItems.size() > 1) {
            secondChild = picItems.get(1);
            getMiddelView(holder.secondLayout, secondChild.getGroupPosition(),
                    secondChild.getChildPosition(), secondChild);
        } else {
            getMiddelView(holder.secondLayout, firstChild.getGroupPosition(), -1, null);
        }
        return convertView;
    }

    private View getTwoRectPicView(View convertView, RowItem item, int width) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.two_mid_pic_layout, null);
            holder = new ViewHolder();
            holder.firstLayout = (RelativeLayout) convertView.findViewById(R.id.firstLayout);
            holder.secondLayout = (RelativeLayout) convertView.findViewById(R.id.secondLayout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        List<IChildItem> picItems = item.getColumnItems();
        LayoutParams params = new LayoutParams(width / 2, width / 2 * 3 / 4);
        holder.firstLayout.setLayoutParams(params);
        holder.secondLayout.setLayoutParams(params);

        IChildItem firstChild = picItems.get(0);
        getRectView(holder.firstLayout, firstChild.getGroupPosition(),
                firstChild.getChildPosition(), firstChild);

        IChildItem secondChild = null;
        if (picItems.size() > 1) {
            secondChild = picItems.get(1);
            getRectView(holder.secondLayout, secondChild.getGroupPosition(),
                    secondChild.getChildPosition(), secondChild);
        } else {
            getRectView(holder.secondLayout, firstChild.getGroupPosition(), -1, null);
        }
        return convertView;
    }

    private View getGroupTitle(View convertView, RowItem item, int width) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.group_title_layout, null);
            holder = new ViewHolder();
            holder.firstLayout = (RelativeLayout) convertView.findViewById(R.id.firstLayout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        getGroupView(holder.firstLayout, item.getGroupItem().getGroupPosition(),
                item.getGroupItem());
        return convertView;
    }

    private View getBigAndSmallPicView(View convertView, RowItem item, int width) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.big_small_pic_layout, null);
            holder = new ViewHolder();
            holder.firstLayout = (RelativeLayout) convertView.findViewById(R.id.firstLayout);
            holder.secondLayout = (RelativeLayout) convertView.findViewById(R.id.secondLayout);
            holder.thirdLayout = (RelativeLayout) convertView.findViewById(R.id.thirdLayout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        List<IChildItem> picItems = item.getColumnItems();

        LayoutParams params = new LayoutParams(width * 2 / 3, width * 2 / 3);
        holder.firstLayout.setLayoutParams(params);
        params = new LayoutParams(width / 3, width / 3);
        holder.secondLayout.setLayoutParams(params);
        holder.thirdLayout.setLayoutParams(params);

        IChildItem firstChild = picItems.get(0);
        getBigView(holder.firstLayout, firstChild.getGroupPosition(),
                firstChild.getChildPosition(), firstChild);

        IChildItem secondChild = null;
        if (picItems.size() > 1) {
            secondChild = picItems.get(1);
            getSmallView(holder.secondLayout, secondChild.getGroupPosition(),
                    secondChild.getChildPosition(), secondChild);
        } else {
            getSmallView(holder.secondLayout, firstChild.getGroupPosition(), -1, null);
        }

        IChildItem thirdChild = null;
        if (picItems.size() > 2) {
            thirdChild = picItems.get(2);
            getSmallView(holder.thirdLayout, thirdChild.getGroupPosition(),
                    thirdChild.getChildPosition(), thirdChild);
        } else {
            getSmallView(holder.thirdLayout, firstChild.getGroupPosition(), -1, null);
        }

        return convertView;
    }

    private View getThreePicView(View convertView, RowItem item, int width) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.three_pic_layout, null);
            holder = new ViewHolder();
            holder.firstLayout = (RelativeLayout) convertView.findViewById(R.id.firstLayout);
            holder.secondLayout = (RelativeLayout) convertView.findViewById(R.id.secondLayout);
            holder.thirdLayout = (RelativeLayout) convertView.findViewById(R.id.thirdLayout);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        List<IChildItem> picItems = item.getColumnItems();
        LayoutParams params = new LayoutParams(width / 3, width / 3);
        holder.firstLayout.setLayoutParams(params);
        holder.secondLayout.setLayoutParams(params);
        holder.thirdLayout.setLayoutParams(params);

        IChildItem firstChild = picItems.get(0);
        getSmallView(holder.firstLayout, firstChild.getGroupPosition(),
                firstChild.getChildPosition(), firstChild);

        IChildItem secondChild = null;
        if (picItems.size() > 1) {
            secondChild = picItems.get(1);
            getSmallView(holder.secondLayout, secondChild.getGroupPosition(),
                    secondChild.getChildPosition(), secondChild);
        } else {
            getSmallView(holder.secondLayout, firstChild.getGroupPosition(), -1, null);
        }

        IChildItem thirdChild = null;
        if (picItems.size() > 2) {
            thirdChild = picItems.get(2);
            getSmallView(holder.thirdLayout, thirdChild.getGroupPosition(),
                    thirdChild.getChildPosition(), thirdChild);
        } else {
            getSmallView(holder.thirdLayout, firstChild.getGroupPosition(), -1, null);
        }

        return convertView;
    }

    public int getCurPosition() {
        return curPosition;
    }

    static class ViewHolder {
        RelativeLayout firstLayout;

        RelativeLayout secondLayout;

        RelativeLayout thirdLayout;
    }

    public abstract void getMiddelView(RelativeLayout parent, int groupPosion, int childPosion,
            IChildItem item);

    public abstract void getRectView(RelativeLayout parent, int groupPosion, int childPosion,
            IChildItem item);

    public abstract void getGroupView(RelativeLayout parent, int groupPosion, IGroupItem item);

    public abstract void getBigView(RelativeLayout parent, int groupPosion, int childPosion,
            IChildItem item);

    public abstract void getSmallView(RelativeLayout parent, int groupPosion, int childPosion,
            IChildItem item);
}

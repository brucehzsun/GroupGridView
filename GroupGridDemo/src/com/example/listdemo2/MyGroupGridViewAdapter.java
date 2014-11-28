
package com.example.listdemo2;

import com.nimo.show.view.GroupGridViewAdapter;
import com.nimo.show.view.IChildItem;
import com.nimo.show.view.IGroupItem;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyGroupGridViewAdapter extends GroupGridViewAdapter {

    private DisplayImageOptions ops;

    private Context context;

    private Toast toast;

    private String defaultUrl = "drawable://" + R.drawable.square_bg;

    public MyGroupGridViewAdapter(Context context, ArrayList<IGroupItem> groups) {
        super(context, groups);
        this.context = context;
        ops = new DisplayImageOptions.Builder().showImageOnLoading(R.drawable.square_bg)
                .showImageForEmptyUri(R.drawable.square_bg).showImageOnFail(R.drawable.square_bg)
                .cacheInMemory(true).cacheOnDisk(true).considerExifParams(true)
                .bitmapConfig(Bitmap.Config.RGB_565).imageScaleType(ImageScaleType.EXACTLY).build();
    }

    @Override
    public void getMiddelView(RelativeLayout parent, int groupPosion, int childPosion,
            IChildItem item) {
        updateView(parent, groupPosion, childPosion, item);

    }

    @Override
    public void getRectView(RelativeLayout parent, int groupPosion, int childPosion, IChildItem item) {
        // TODO Auto-generated method stub
        updateView(parent, groupPosion, childPosion, item);

    }

    @Override
    public void getGroupView(RelativeLayout parent, int groupPosion, IGroupItem item) {
        TextView textView;
        if (parent.getChildCount() == 0) {
            textView = new TextView(context);
            parent.addView(textView);
        } else {
            textView = ((TextView) parent.getChildAt(0));
        }
        textView.setText(item.getName());
    }

    @Override
    public void getBigView(RelativeLayout parent, int groupPosion, int childPosion, IChildItem item) {
        updateView(parent, groupPosion, childPosion, item);

    }

    @Override
    public void getSmallView(RelativeLayout parent, int groupPosion, int childPosion,
            IChildItem item) {
        updateView(parent, groupPosion, childPosion, item);

    }

    private void updateView(RelativeLayout parent, final int groupPosion, final int childPosion,
            IChildItem item) {
        ImageView imageView;
        TextView textView;
        if (parent.getChildCount() == 0) {
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                    LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);

            imageView = new ImageView(context);
            imageView.setScaleType(ScaleType.FIT_XY);
            imageView.setLayoutParams(lp);
            textView = new TextView(context);
            parent.addView(imageView);
            parent.addView(textView);
        } else {
            imageView = ((ImageView) parent.getChildAt(0));
            textView = ((TextView) parent.getChildAt(1));
        }

        if (item != null) {
            ImageLoader.getInstance().displayImage(item.getImgUrl(), imageView, ops);
            textView.setText(groupPosion + "-" + childPosion);
        } else {
            ImageLoader.getInstance().displayImage(defaultUrl, imageView, ops);
        }

        imageView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (toast == null) {
                    toast = Toast.makeText(context, groupPosion + "-" + childPosion, 1);
                    toast.show();
                } else {
                    toast.setText(groupPosion + "-" + childPosion);
                    toast.show();
                }
            }
        });
    }

}

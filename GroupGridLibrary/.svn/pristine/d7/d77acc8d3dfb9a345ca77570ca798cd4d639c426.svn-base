
package com.nimo.show.view;

import java.util.ArrayList;

public class RowItem {

    private boolean isGroup;

    // 图片组合样式
    // 0:3个小图，
    // 1:两个中等大图
    // 2: 1个大图2个小图
    // 3:2个个长图
    // 4:group
    private int showStyle;
    
    private ArrayList<IChildItem> columnItems;
    
    private IGroupItem group;

    private String name;
    
    public IGroupItem getGroupItem() {
        return group;
    }

    public void setGroupItem(IGroupItem group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<IChildItem> getColumnItems() {
        return columnItems;
    }

    public void setColumnItems(ArrayList<IChildItem> columnItem) {
        this.columnItems = columnItem;
    }

    public int getShowStyle() {
        return showStyle;
    }

    public void setShowStyle(int showStyle) {
        this.showStyle = showStyle;
    }

    public boolean isGroup() {
        return isGroup;
    }

    public void setGroup(boolean isGroup) {
        this.isGroup = isGroup;
    }

    public static interface ShowStyle {
        // 图片组合样式
        // 0:3个小图，
        int STYLE_THREE_SMALL_IMG = 0;

        // 1:两个中等大图
        int STYLE_TWO_MIDDLE_IMG = 1;

        // 2: 1个大图2个小图
        int STYLE_ONE_BIG_AND_TWO_SMALL = 2;

        // 3:2个个长图
        int STYLE_TWO_SQUARE_IMG = 3;

        // 4:group
        int STYLE_GROUP = 4;
    }
}

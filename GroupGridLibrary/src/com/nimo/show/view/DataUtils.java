
package com.nimo.show.view;

import com.nimo.show.view.RowItem.ShowStyle;

import java.util.ArrayList;

public class DataUtils {

    private static ArrayList<IChildItem> columnItems;

    public static ArrayList<RowItem> formatData(ArrayList<IGroupItem> groups) {
        ArrayList<RowItem> rowList = new ArrayList<RowItem>();
        for (int i = 0; i < groups.size(); i++) {
            IGroupItem group = groups.get(i);
            group.setGroupPosition(i);

            // 创建group title
            RowItem groupItem = createRowItem(ShowStyle.STYLE_GROUP);
            groupItem.setName(groups.get(i).getName());
            groupItem.setGroup(true);
            groupItem.setColumnItems(null);
            try {
                IGroupItem newGroup = (IGroupItem) group.clone();
                newGroup.setChirldList(null);
                groupItem.setGroupItem(newGroup);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            rowList.add(groupItem);

            columnItems = new ArrayList<IChildItem>();

            ArrayList<IChildItem> childList = groups.get(i).getChirldList();
            int childCount = childList.size();
            for (int j = 0; j < childCount; j++) {
                IChildItem child = childList.get(j);
                child.setGroupPosition(i);
                child.setChildPosition(j);
                columnItems.add(child);

                switch (childCount) {
                    case 1:
                        rowList.add(createRowItem(ShowStyle.STYLE_TWO_MIDDLE_IMG));
                        break;
                    case 2:
                        // 创建两个中图模式.
                        if (j == 1) {
                            rowList.add(createRowItem(ShowStyle.STYLE_TWO_MIDDLE_IMG));
                        }
                        break;
                    case 3:
                        // 创建一个大图两个小图模式.
                        if (j == 2) {
                            rowList.add(createRowItem(ShowStyle.STYLE_ONE_BIG_AND_TWO_SMALL));
                        }
                        break;
                    case 4:
                        if (j == 1 || j == 3) {
                            rowList.add(createRowItem(ShowStyle.STYLE_TWO_MIDDLE_IMG));
                        }
                        break;
                    case 5:
                        if (j == 2 || j == 4) {
                            rowList.add(createRowItem(j == 2 ? ShowStyle.STYLE_ONE_BIG_AND_TWO_SMALL
                                    : ShowStyle.STYLE_TWO_SQUARE_IMG));
                        }
                        break;
                    case 6:
                        if (j == 2 || j == 5) {
                            rowList.add(createRowItem(j == 2 ? ShowStyle.STYLE_ONE_BIG_AND_TWO_SMALL
                                    : ShowStyle.STYLE_THREE_SMALL_IMG));
                        }
                        break;
                    case 7:
                        if (j == 1 || j == 3 || j == 6) {
                            rowList.add(createRowItem(j == 6 ? ShowStyle.STYLE_THREE_SMALL_IMG
                                    : ShowStyle.STYLE_TWO_SQUARE_IMG));
                        }
                        break;
                    case 8:
                        if (j == 1 || j == 4 || j == 7) {
                            rowList.add(createRowItem(j == 1 ? ShowStyle.STYLE_TWO_SQUARE_IMG
                                    : ShowStyle.STYLE_THREE_SMALL_IMG));
                        }
                        break;
                    default:
                        if (j > 0 && (j % 3 == 0 || j == childCount - 1)) {
                            rowList.add(createRowItem(ShowStyle.STYLE_THREE_SMALL_IMG));
                        }
                        break;
                }
            }
        }
        return rowList;
    }

    private static RowItem createRowItem(int showStyle) {
        RowItem tempItem = new RowItem();
        tempItem.setShowStyle(showStyle);
        tempItem.setColumnItems(columnItems);
        columnItems = new ArrayList<IChildItem>();
        return tempItem;
    }

}

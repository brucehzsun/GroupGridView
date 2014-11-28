/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      "http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.listdemo2;

import com.nimo.show.view.IChildItem;
import com.nimo.show.view.IGroupItem;

import java.util.ArrayList;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally
     * the PicasaWeb API should be used to fetch the URLs. Credit to Romain Guy
     * for the photos: "http://www.curious-creature.org/
     * "https://plus.google.com/109538161516040592207/about
     * "http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageThumbUrls = new String[] {
            "http://221.2.159.215:90/uploads/allimg/090705/1345133136-0.jpg",
            "http://pic1.nipic.com/2008-08-18/200881810539560_2.jpg",
            "http://pic2.ooopic.com/01/44/31/20b1OOOPIC5c.jpg",
            "http://www.zhituad.com/photo2/00/87/68/38b1OOOPICf9.jpg",
            "http://pic17.nipic.com/20111105/2319273_205848171000_2.jpg",
            "http://5.133998.com/picture/pic/000/365/f681dd9504080ca29130fba463c3f29b.jpg",
            "http://5.133998.com/picture/pic/000/365/6a7386665797fe7318f96f55bed8ef45.jpg",
            "http://5.133998.com/picture/pic/000/365/88142a2c59e38b75a8bcf1925e95aba3.jpg",
            "http://5.133998.com/picture/pic/000/365/d684567389b908855d6ed7d13ac9cceb.jpg",
            "http://5.133998.com/picture/pic/000/362/52c3f948d3006391513185b75938b2da.jpg",
            "http://5.133998.com/picture/pic/000/361/73e7d595fcd8ddded5feb87acb13114d.jpg",
            "http://5.133998.com/picture/pic/000/326/dee50f8f8ee203f6bdd6bde31da6a674.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1529460315,1563301094&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=3177375201,199462969&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=2039352201,2580204326&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=1641118538,775739304&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1241444754,3599492497&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2075033529,1148830389&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=4158133571,3844166507&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=1549720149,3657579959&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=962210826,3453738889&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1991365234,1170798023&fm=23&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=3014662520,3629329514&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=4061553379,2054490124&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2927404587,1890184647&fm=23&gp=0.jpg",
            
            "http://221.2.159.215:90/uploads/allimg/090705/1345133136-0.jpg",
            "http://pic1.nipic.com/2008-08-18/200881810539560_2.jpg",
            "http://pic2.ooopic.com/01/44/31/20b1OOOPIC5c.jpg",
            "http://www.zhituad.com/photo2/00/87/68/38b1OOOPICf9.jpg",
            "http://pic17.nipic.com/20111105/2319273_205848171000_2.jpg",
            "http://5.133998.com/picture/pic/000/365/f681dd9504080ca29130fba463c3f29b.jpg",
            "http://5.133998.com/picture/pic/000/365/6a7386665797fe7318f96f55bed8ef45.jpg",
            "http://5.133998.com/picture/pic/000/365/88142a2c59e38b75a8bcf1925e95aba3.jpg",
            "http://5.133998.com/picture/pic/000/365/d684567389b908855d6ed7d13ac9cceb.jpg",
            "http://5.133998.com/picture/pic/000/362/52c3f948d3006391513185b75938b2da.jpg",
            "http://5.133998.com/picture/pic/000/361/73e7d595fcd8ddded5feb87acb13114d.jpg",
            "http://5.133998.com/picture/pic/000/326/dee50f8f8ee203f6bdd6bde31da6a674.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1529460315,1563301094&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=3177375201,199462969&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=2039352201,2580204326&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=1641118538,775739304&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1241444754,3599492497&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2075033529,1148830389&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=4158133571,3844166507&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=1549720149,3657579959&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=962210826,3453738889&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1991365234,1170798023&fm=23&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=3014662520,3629329514&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=4061553379,2054490124&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2927404587,1890184647&fm=23&gp=0.jpg",
            
            "http://221.2.159.215:90/uploads/allimg/090705/1345133136-0.jpg",
            "http://pic1.nipic.com/2008-08-18/200881810539560_2.jpg",
            "http://pic2.ooopic.com/01/44/31/20b1OOOPIC5c.jpg",
            "http://www.zhituad.com/photo2/00/87/68/38b1OOOPICf9.jpg",
            "http://pic17.nipic.com/20111105/2319273_205848171000_2.jpg",
            "http://5.133998.com/picture/pic/000/365/f681dd9504080ca29130fba463c3f29b.jpg",
            "http://5.133998.com/picture/pic/000/365/6a7386665797fe7318f96f55bed8ef45.jpg",
            "http://5.133998.com/picture/pic/000/365/88142a2c59e38b75a8bcf1925e95aba3.jpg",
            "http://5.133998.com/picture/pic/000/365/d684567389b908855d6ed7d13ac9cceb.jpg",
            "http://5.133998.com/picture/pic/000/362/52c3f948d3006391513185b75938b2da.jpg",
            "http://5.133998.com/picture/pic/000/361/73e7d595fcd8ddded5feb87acb13114d.jpg",
            "http://5.133998.com/picture/pic/000/326/dee50f8f8ee203f6bdd6bde31da6a674.jpg",
            "http://img5.imgtn.bdimg.com/it/u=1529460315,1563301094&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=3177375201,199462969&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=2039352201,2580204326&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=1641118538,775739304&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1241444754,3599492497&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=2075033529,1148830389&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=4158133571,3844166507&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=1549720149,3657579959&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=962210826,3453738889&fm=21&gp=0.jpg",
            "http://img3.imgtn.bdimg.com/it/u=1991365234,1170798023&fm=23&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=3014662520,3629329514&fm=21&gp=0.jpg",
            "http://img1.imgtn.bdimg.com/it/u=4061553379,2054490124&fm=21&gp=0.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2927404587,1890184647&fm=23&gp=0.jpg",
    };
    
    public static ArrayList<IGroupItem> getGroupListData() {

        String[] urls = Images.imageThumbUrls;

        ArrayList<IGroupItem> groupList = new ArrayList<IGroupItem>();
        ArrayList<IChildItem> childList = new ArrayList<IChildItem>();

        int groupIndex = 0;
        for (int i = 0; i < urls.length; i++) {
            MyChildItem child = new MyChildItem();
            child.setImgUrl(urls[i]);
            childList.add(child);

            if (i == 0 || i == 2 || i == 5 || i == 9 || i == 14 || i == 20 || i == 27 || i == 35
                    || i == urls.length - 1) {
                groupIndex++;
                MyGroupItem group = new MyGroupItem();
                group.setName("第" + groupIndex + "组");
                group.setChirldList(childList);
                groupList.add(group);
                childList = new ArrayList<IChildItem>();
            }
        }
        return groupList;
    }
}

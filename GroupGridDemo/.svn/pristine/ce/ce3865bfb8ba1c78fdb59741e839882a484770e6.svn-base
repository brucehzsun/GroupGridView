
package com.example.listdemo2;

import com.nimo.show.view.GroupGridViewAdapter;
import com.nimo.show.view.IGroupItem;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.listener.PauseOnScrollListener;
import com.nostra13.universalimageloader.utils.StorageUtils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends Activity implements OnScrollListener{

    private ListView listView;

    GroupGridViewAdapter adapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageLoader(getApplicationContext());

        listView = (ListView) findViewById(R.id.listView);
        listView.setOnScrollListener(new PauseOnScrollListener(ImageLoader.getInstance(), false,
                true,this));
        ArrayList<IGroupItem> showItems = Images.getGroupListData();

        adapter = new MyGroupGridViewAdapter(this, showItems);
        listView.setAdapter(adapter);
    }

    private void initImageLoader(Context context) {
        // This configuration tuning is custom. You can tune every option, you
        // may tune some of them,
        // or you can create default configuration by
        // ImageLoaderConfiguration.createDefault(this);
        // method.
        long availableMemory = Runtime.getRuntime().maxMemory();
        File cacheDir = StorageUtils.getCacheDirectory(context);
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .diskCacheExtraOptions(480, 800, null)
                //
                .threadPriority(Thread.NORM_PRIORITY - 2)
                //
                .denyCacheImageMultipleSizesInMemory()
                //
                .diskCache(new UnlimitedDiscCache(cacheDir))
                // default
                .diskCacheSize(50 * 1024 * 1024).diskCacheFileCount(1000)
                .diskCacheFileNameGenerator(new Md5FileNameGenerator())//
                .tasksProcessingOrder(QueueProcessingType.LIFO)//
                .memoryCache(new WeakMemoryCache()).memoryCacheSizePercentage(15)
                // .writeDebugLogs() // Remove for release app
                .build();
        // Initialize ImageLoader with configuration.
        ImageLoader.getInstance().init(config);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
            int totalItemCount) {
        // TODO Auto-generated method stub
        
    }

}

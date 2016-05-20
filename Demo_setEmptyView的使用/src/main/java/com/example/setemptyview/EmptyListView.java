package com.example.setemptyview;

import android.content.Context;
import android.view.View;
import android.widget.ListView;

/**
 * Created by wyh on 2016/4/22.
 * Email : wyh2email@163.com
 */
public class EmptyListView extends ListView {
    public EmptyListView(Context context) {
        super(context);
    }

    @Override
    public void setEmptyView(View emptyView) {
        super.setEmptyView(emptyView);
    }
}

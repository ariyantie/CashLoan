package com.dumai.loan.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.util.view.ToolbarHelper;

/**
 * haoruigang
 * 历史记录
 * 2017-12-11 14:56:08
 */
public class HistoryActivity extends BaseActivity {

    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_history;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("历史记录");
        Toolbar toolbar = toolbarHelper.getToolbar();
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

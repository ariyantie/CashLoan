package com.dumai.loan.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.util.view.ToolbarHelper;

/**
 * haoruigang
 * 2017-12-6 11:37:48
 * 进行查询
 */
public class ScheduledExActivity extends BaseActivity {

    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_scheduled_ex;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("进度查询");

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

package com.dumai.loan.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.util.view.ToolbarHelper;

/**
 * 我的推介人
 * haoruigang
 * 2017-12-11 14:37:47
 */
public class MyRefereeActivity extends BaseActivity {

    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_my_referee;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("我的推荐人");
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

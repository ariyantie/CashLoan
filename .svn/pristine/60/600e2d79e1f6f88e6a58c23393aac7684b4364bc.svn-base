package com.dumai.loan.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.util.view.ToolbarHelper;

/**
 * 2017-12-11 16:33:22
 * haoruigang
 * 帮助中心
 */
public class CenterHelpActivity extends BaseActivity {


    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_center_help;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("帮助中心");
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

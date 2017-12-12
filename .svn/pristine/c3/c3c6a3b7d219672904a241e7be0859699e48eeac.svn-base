package com.dumai.loan.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.util.view.ToolbarHelper;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 更多
 * 2017-12-11 16:25:11
 * haoruigang
 */
public class MoreActivity extends BaseActivity {


    @BindView(R.id.ll_online_service)
    LinearLayout llOnlineService;
    @BindView(R.id.ll_help_center)
    LinearLayout llHelpCenter;
    @BindView(R.id.ll_goto_score)
    LinearLayout llGotoScore;
    @BindView(R.id.ll_about_us)
    LinearLayout llAboutUs;

    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_more;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("更多");
        Toolbar toolbar = toolbarHelper.getToolbar();
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @OnClick({R.id.ll_online_service, R.id.ll_help_center, R.id.ll_goto_score, R.id.ll_about_us})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_online_service:
                break;
            case R.id.ll_help_center:
                startActivity(new Intent(MoreActivity.this, CenterHelpActivity.class));
                break;
            case R.id.ll_goto_score:
                break;
            case R.id.ll_about_us:
                break;
        }
    }
}

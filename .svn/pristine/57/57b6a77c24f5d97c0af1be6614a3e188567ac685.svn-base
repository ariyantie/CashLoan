package com.dumai.loan.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.util.view.ToolbarHelper;

/**
 * 2017-12-11 15:11:44
 * haoruigang
 * 借款银行卡
 */
public class LoanCardActivity extends BaseActivity {


    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_loan_card;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("借款银行卡");
        toolbarHelper.setMenuTitle("添加", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoanCardActivity.this, DebitCardAddActivity.class));
            }
        }, null);
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

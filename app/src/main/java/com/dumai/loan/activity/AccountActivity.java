package com.dumai.loan.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.dumai.loan.R;
import com.dumai.loan.base.BaseActivity;
import com.dumai.loan.commons.ToUIEvent;
import com.dumai.loan.util.SharedUtils;
import com.dumai.loan.util.view.ToolbarHelper;
import com.dumai.loan.view.CircleImg;

import butterknife.BindView;
import butterknife.OnClick;
import de.greenrobot.event.EventBus;

/**
 * 2017-12-7 14:54:03
 * haoruigang
 * 账户信息
 */
public class AccountActivity extends BaseActivity {


    @BindView(R.id.backdrop)
    CircleImg backdrop;
    @BindView(R.id.btn_signout)
    Button btnSignout;

    @Override
    protected int getContentViewId() {
        return R.layout.dm_activity_account;
    }

    @Override
    protected void initToolbar(ToolbarHelper toolbarHelper) {
        toolbarHelper.setTitle("账号信息");
        Toolbar toolbar = toolbarHelper.getToolbar();
        toolbar.setNavigationIcon(R.drawable.icon_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @OnClick({R.id.backdrop, R.id.btn_signout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.backdrop:
                takePicture();
                break;
            case R.id.btn_signout:
                SharedUtils.putBoolean(AccountActivity.this, "LoginSuccess", false);
                EventBus.getDefault().post(new ToUIEvent(ToUIEvent.SIGN_OUT_EVENT));
                finish();
                break;
        }
    }

    public void takePicture() {
        //上传图片
        Intent intent = new Intent(AccountActivity.this, CameraActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CameraActivity.ISUPDATE, false);
        intent.putExtras(bundle);
        startActivityForResult(intent, CameraActivity.ACTIVITY_RESULT);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        if (resultCode == RESULT_OK) {
            if (requestCode == CameraActivity.ACTIVITY_RESULT) {
                Uri picture = data.getData();
                Bitmap photo = BitmapFactory.decodeFile(picture.getPath());
                backdrop.setImageBitmap(photo);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}

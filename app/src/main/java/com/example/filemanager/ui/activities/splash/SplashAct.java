package com.example.filemanager.ui.activities.splash;

import android.content.Intent;
import android.os.Handler;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseActivity;
import com.example.filemanager.ui.activities.account.AccountAct;

public class SplashAct extends BaseActivity<SplashViewModel> {

    @Override
    protected Class<SplashViewModel> getClassViewModel() {
        return SplashViewModel.class;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.act_splash;
    }

    @Override
    protected void initViews() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashAct.this, AccountAct.class));
                finish();
            }
        },6000);
    }
}

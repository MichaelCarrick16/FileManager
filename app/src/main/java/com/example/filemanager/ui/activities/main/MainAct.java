package com.example.filemanager.ui.activities.main;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseActivity;
import com.example.filemanager.ui.callback.OnClickButtonBack;
import com.example.filemanager.ui.fragment.home.HomeFragment;

public class MainAct extends BaseActivity<MainViewModel> implements OnClickButtonBack {
    private HomeFragment homeFragment;

    @Override
    protected Class<MainViewModel> getClassViewModel() {
        return MainViewModel.class;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.act_main;
    }

    @Override
    protected void initViews() {
        showHomeFragment();
    }

    private void showHomeFragment() {
        homeFragment = new HomeFragment();
        homeFragment.setOnClickButtonBack(this);
        showFragment(R.id.frame_layout_main,homeFragment,false);
    }

    @Override
    public void onBack() {
        finish();
    }
}
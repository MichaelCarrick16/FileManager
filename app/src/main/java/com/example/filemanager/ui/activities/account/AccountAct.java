package com.example.filemanager.ui.activities.account;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseActivity;

public class AccountAct extends BaseActivity<AccountViewModel> {
    @Override
    protected Class<AccountViewModel> getClassViewModel() {
        return AccountViewModel.class;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.act_account;
    }

    @Override
    protected void initViews() {

    }
}

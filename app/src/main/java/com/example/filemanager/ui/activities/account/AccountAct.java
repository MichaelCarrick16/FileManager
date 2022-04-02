package com.example.filemanager.ui.activities.account;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseActivity;
import com.example.filemanager.ui.callback.OnActionNavigateFragment;
import com.example.filemanager.ui.fragment.login.LoginFragment;
import com.example.filemanager.ui.fragment.register.RegisterFragment;

public class AccountAct extends BaseActivity<AccountViewModel> implements OnActionNavigateFragment {
    private LoginFragment loginFragment;
    private RegisterFragment registerFragment;
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
        showScreenLogin();
    }

    private void showScreenLogin() {
        loginFragment = new LoginFragment();
        loginFragment.setOnActionNavigateFragment(this);
        showFragment(R.id.frame_layout_account,loginFragment,false);
    }

    @Override
    public void onNavigateFragment(String key, Object object) {
        switch (key){
            case LoginFragment.KEY_NAVIGATE_LOGIN_TO_REGISTER :
                showScreenRegister();
                break;
        }
    }

    private void showScreenRegister() {
        registerFragment = new RegisterFragment();
        showFragment(R.id.frame_layout_account,registerFragment,true);
    }
}

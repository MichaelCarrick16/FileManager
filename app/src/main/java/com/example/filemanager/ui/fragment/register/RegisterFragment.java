package com.example.filemanager.ui.fragment.register;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseFragment;

public class RegisterFragment extends BaseFragment<RegisterViewModel> {

    @Override
    protected Class<RegisterViewModel> getClassModel() {
        return RegisterViewModel.class;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.frag_register;
    }
}

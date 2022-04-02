package com.example.filemanager.ui.fragment.home;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseFragment;

public class HomeFragment extends BaseFragment<HomeViewModel> {
    @Override
    protected Class<HomeViewModel> getClassModel() {
        return HomeViewModel.class;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.frag_home;
    }
}

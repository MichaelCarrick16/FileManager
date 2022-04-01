package com.example.filemanager.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.filemanager.R;


public abstract class  BaseActivity<T extends ViewModel> extends AppCompatActivity implements View.OnClickListener {
    protected T mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mModel = new ViewModelProvider(this).get(getClassViewModel());
        initViews();
    }

    protected abstract Class<T> getClassViewModel();

    protected abstract int getLayoutId();

    protected abstract void initViews();


    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    public void onClick(View view) {

    }

    protected void showFragment(int layoutId, Fragment fragment, boolean addToBackStack) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(layoutId, fragment);
        if (addToBackStack) {
            transaction.addToBackStack("add");
        }
        transaction.commit();
    }
}

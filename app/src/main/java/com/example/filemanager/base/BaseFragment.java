package com.example.filemanager.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public abstract class BaseFragment<T extends BaseViewModel> extends Fragment implements View.OnClickListener {
    protected T mModel;
    protected View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutId(), container, false);
        mModel = new ViewModelProvider(this).get(getClassModel());
        initViews();
        return rootView;
    }

    protected abstract Class<T> getClassModel();

    protected abstract void initViews();

    protected abstract int getLayoutId();

    public final  <T extends View> T findViewById(int id) {
        return findViewById(id,null);
    }
    public final  <T extends View> T findViewById(int id, View.OnClickListener event) {
        T v = rootView.findViewById(id);

        if (v!=null&& event!=null){
            v.setOnClickListener(event);
        }
        return v;

    }

    @Override
    public void onClick(View view) {

    }
}

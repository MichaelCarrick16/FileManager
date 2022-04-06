package com.example.filemanager.ui.fragment.home;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

import com.example.filemanager.R;
import com.example.filemanager.base.BaseFragment;
import com.example.filemanager.ui.callback.OnClickButtonBack;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class HomeFragment extends BaseFragment<HomeViewModel> {
    private ConstraintLayout constrainLayoutBackHome , constraintLayoutSortHome;
    private TextView tvFoldersTopHome;
    private NestedScrollView nestedScrollviewHome;
    private OnClickButtonBack onClickButtonBack;

    @Override
    protected Class<HomeViewModel> getClassModel() {
        return HomeViewModel.class;
    }

    @Override
    protected void initViews() {
        initMapping();
        initEvents();
        dragNestedScrollView();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.frag_home;
    }

    private void initEvents() {
        constrainLayoutBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickButtonBack.onBack();
            }
        });

        
        constraintLayoutSortHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View viewDialog = LayoutInflater.from(getContext()).inflate(R.layout.layout_bottom_sheet_home,null);
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext(),R.style.SheetDialog);
                bottomSheetDialog.setContentView(viewDialog);
                bottomSheetDialog.show();

            }
        });
    }

    private void initMapping() {
        constrainLayoutBackHome = findViewById(R.id.constrain_layout_back_home);
        constraintLayoutSortHome = findViewById(R.id.constrain_layout_sort_home);
        tvFoldersTopHome = findViewById(R.id.tv_folders_top_home);
        nestedScrollviewHome = findViewById(R.id.nested_scrollview_home);
    }

    public void setOnClickButtonBack(OnClickButtonBack onClickButtonBack) {
        this.onClickButtonBack = onClickButtonBack;
    }

    private void dragNestedScrollView() {
        tvFoldersTopHome.setVisibility(View.INVISIBLE);

        nestedScrollviewHome.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY < 50) {
                    tvFoldersTopHome.setVisibility(View.INVISIBLE);
                } else {
                    tvFoldersTopHome.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}

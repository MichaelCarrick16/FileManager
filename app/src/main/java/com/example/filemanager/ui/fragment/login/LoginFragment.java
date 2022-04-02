package com.example.filemanager.ui.fragment.login;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.filemanager.MainActivity;
import com.example.filemanager.R;
import com.example.filemanager.base.BaseFragment;
import com.example.filemanager.ui.callback.OnActionNavigateFragment;

public class LoginFragment extends BaseFragment<LoginViewModel> {
    public static final String KEY_NAVIGATE_LOGIN_TO_REGISTER = "KEY_NAVIGATE_LOGIN_TO_REGISTER";
    private EditText edtEmailLogin , edtPasswordLogin;
    private Button btLogin;
    private TextView tvRegister;
    private OnActionNavigateFragment onActionNavigateFragment;

    @Override
    protected Class<LoginViewModel> getClassModel() {
        return LoginViewModel.class;
    }

    @Override
    protected void initViews() {
        initMapping();
        initEvents();
    }

    public void setOnActionNavigateFragment(OnActionNavigateFragment onActionNavigateFragment) {
        this.onActionNavigateFragment = onActionNavigateFragment;
    }

    private void initMapping() {
        edtEmailLogin = findViewById(R.id.edt_email_login);
        edtPasswordLogin = findViewById(R.id.edt_password_login);
        btLogin = findViewById(R.id.bt_login_login);
        tvRegister = findViewById(R.id.tv_register_login);
    }

    private void initEvents() {
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActionNavigateFragment.onNavigateFragment(KEY_NAVIGATE_LOGIN_TO_REGISTER,null);
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.frag_login;
    }
}

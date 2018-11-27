package com.st.c10.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.st.c10.R;
import com.st.c10.base.BaseActivity;
import com.st.c10.bean.UserBean;
import com.st.c10.interfaces.LoginConnect;
import com.st.c10.presenter.LoginPresenter;
import com.st.c10.utils.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @Description 登录界面
 * @Author fpp
 * @Date 2018/11/25 0025 22:10
 */
public class LoginActivity extends BaseActivity<LoginConnect.Presenter> implements LoginConnect.View {


    @BindView(R.id.et_aty_login_account)
    EditText etAtyLoginAccount;
    @BindView(R.id.et_aty_login_password)
    EditText etAtyLoginPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        initView();
        initData();

    }

    private void initData() {


    }

    private void initView() {


    }


    @Override
    public void loginSuccess(UserBean userBean) {
        LogUtil.e("dududu");

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

    }

    @Override
    public void error(String msg) {

        Toast.makeText(this, "登录失败！" + msg, Toast.LENGTH_LONG).show();

    }

    @Override
    public LoginConnect.Presenter initPresenter() {

        return new LoginPresenter(this);
    }

    @OnClick(R.id.tv_aty_login_login)
    public void onViewClicked() {

        presenter.login(etAtyLoginAccount.getText().toString(), etAtyLoginPassword.getText().toString());

    }
}

package com.st.c10.ui;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.landicorp.android.eptapi.utils.SystemInfomation;
import com.st.c10.R;
import com.st.c10.base.BaseActivity;
import com.st.c10.bean.response.IsOnlineRepBean;
import com.st.c10.interfaces.InitConnect;
import com.st.c10.presenter.InitPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author fpp
 * @description: 初始化界面
 * @date 2018/11/22 14:35
 */
public class InitActivity extends BaseActivity<InitConnect.Presenter> implements InitConnect.View {


    @BindView(R.id.tv_aty_init_login)
    TextView tvAtyInitLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_init);
        ButterKnife.bind(this);
        initView();
        initData();

    }

    private void initData() {
        //设备检测并获取设备序列号
//        String posSn = SystemInfomation.getDeviceInfo().getSerialNo();
//        presenter.isOnline(posSn);
    }

    private void initView() {

    }


    @Override
    public InitConnect.Presenter initPresenter() {
        return new InitPresenter(this);
    }

    @Override
    public void isOnlineSuccess(IsOnlineRepBean isOnlineRepBean) {

    }

    @Override
    public void initDeviceSuccess() {

    }

    @Override
    public void error(String msg) {

    }

    @OnClick(R.id.tv_aty_init_login)
    public void onViewClicked() {
        Intent intent = new Intent(InitActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}

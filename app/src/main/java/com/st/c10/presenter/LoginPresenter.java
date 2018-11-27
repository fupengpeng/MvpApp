package com.st.c10.presenter;


import com.google.gson.Gson;
import com.st.c10.base.BasePresenterImpl;
import com.st.c10.bean.request.IsOnlineReqBean;
import com.st.c10.bean.request.LoginRequest;
import com.st.c10.bean.response.LoginResponse;
import com.st.c10.interfaces.LoginConnect;
import com.st.c10.model.http.okhttp.CallBackUtil;
import com.st.c10.model.http.okhttp.OkHttpUtil;
import com.st.c10.utils.Constant;
import com.st.c10.utils.TimeUtil;

import java.util.HashMap;

import okhttp3.Call;

/**
 * @Description 登录业务处理
 * @Author fpp
 * @Date 2018/11/25 0025 22:09
 */
public class LoginPresenter extends BasePresenterImpl<LoginConnect.View> implements LoginConnect.Presenter {

    public LoginPresenter(LoginConnect.View view) {
        super(view);
    }

    LoginRequest loginRequest = new LoginRequest();

    @Override
    public void login(String account, String password) {
        loginRequest.setUsername(account);
        loginRequest.setPassword(password);
        loginRequest.setDevice_type("android");
        loginRequest.setVersion_number("1.0");
        loginRequest.setRegistrationid("");


        IsOnlineReqBean isOnlineReqBean = new IsOnlineReqBean();
        isOnlineReqBean.setFuncId("9999");
        isOnlineReqBean.setPosNo("");
        isOnlineReqBean.setPosSn("");
        isOnlineReqBean.setCasherNo("");
        isOnlineReqBean.setReqDate(TimeUtil.getCurrentTime());
        isOnlineReqBean.setShopNo("");
        isOnlineReqBean.setWorkday("");
        isOnlineReqBean.setPosMode("");
        isOnlineReqBean.setSign("");
        isOnlineReqBean.setPosVersion("");


        final Gson gson = new Gson();

        String req = gson.toJson(isOnlineReqBean);

        String url = "https://yun.xiaojiangjiakao.com/api/user/public/login/";


        HashMap<String, String> paramsMap = new HashMap<>();
        paramsMap.put("username", account);
        paramsMap.put("password", password);
        paramsMap.put("device_type", "android");
        paramsMap.put("version_number", "1.0.0");
        paramsMap.put("registrationid", "1125");

        OkHttpUtil.okHttpPost(url, paramsMap, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {
                view.error(e.getMessage());
            }

            @Override
            public void onResponse(String response) {

                LoginResponse loginResponse = gson.fromJson(response, LoginResponse.class);
                if (loginResponse.getCode() == 1) {
                    view.loginSuccess(loginResponse.getUserBean());
                }
            }
        });

    }
}

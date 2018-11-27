package com.st.c10.presenter;

import com.google.gson.Gson;
import com.st.c10.base.BasePresenterImpl;
import com.st.c10.bean.request.IsOnlineReqBean;
import com.st.c10.bean.response.IsOnlineRepBean;
import com.st.c10.interfaces.InitConnect;
import com.st.c10.model.http.okhttp.CallBackUtil;
import com.st.c10.model.http.okhttp.OkHttpUtil;
import com.st.c10.utils.Constant;
import com.st.c10.utils.TimeUtil;

import java.util.HashMap;

import okhttp3.Call;


/**
 * @author fpp
 * @Description: 初始化控制
 * @date 2018/11/22 14:42
 */

public class InitPresenter extends BasePresenterImpl<InitConnect.View> implements InitConnect.Presenter {


    public InitPresenter(InitConnect.View view) {
        super(view);
    }

    @Override
    public void isOnline(String posSn) {
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

        HashMap<String, String> paramsMap = new HashMap<>();
        paramsMap.put("req",req);
        OkHttpUtil.okHttpPost(Constant.BASE_URL, paramsMap, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {
                view.error(e.getMessage());
            }

            @Override
            public void onResponse(String response) {
                IsOnlineRepBean isOnlineRepBean = gson.fromJson(response, IsOnlineRepBean.class);
                if (isOnlineRepBean.getCode()==0){
                    view.isOnlineSuccess(isOnlineRepBean);
                }

            }
        });


    }

    @Override
    public void initDevice() {

    }
}

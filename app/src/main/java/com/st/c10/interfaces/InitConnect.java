package com.st.c10.interfaces;

import com.st.c10.base.BasePresenter;
import com.st.c10.base.BaseView;
import com.st.c10.bean.response.IsOnlineRepBean;

/**
 * @author fpp
 * @Description:  初始化接口
 * @date 2018/11/22 14:37
 */

public interface InitConnect {

    interface View extends BaseView{

        void isOnlineSuccess(IsOnlineRepBean isOnlineRepBean);

        void initDeviceSuccess();


        void error(String msg);


    }

    interface Presenter extends BasePresenter{


        /**
         * 收银机联线检查
         */
        void isOnline(String posSn);


        /**
         * 设备检测
         */
        void initDevice();


    }



}

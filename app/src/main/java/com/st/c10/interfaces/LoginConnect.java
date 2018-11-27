package com.st.c10.interfaces;

import com.st.c10.base.BasePresenter;
import com.st.c10.base.BaseView;
import com.st.c10.bean.UserBean;

/**
 * Created by fpp on 2018/11/25 0025.
 */

public interface LoginConnect {


    interface View extends BaseView {

        void loginSuccess(UserBean userBean);


        void error(String msg);


    }

    interface Presenter extends BasePresenter {


        /**
         * 登录
         */
        void login(String account , String password);




    }



}

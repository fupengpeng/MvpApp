package com.st.c10.bean.response;

import com.alibaba.fastjson.serializer.SerializeFilter;
import com.st.c10.bean.RepBean;
import com.st.c10.bean.UserBean;

/**
 * Created by fpp on 2018/11/25 0025.
 */

public class LoginResponse extends RepBean implements SerializeFilter{

    /**
     * data : {"user_type":20,"sex":2,"birthday":682959600,"last_login_time":0,"score":0,"coin":0,"balance":"0.00","create_time":1531276840,"user_status":1,"user_nickname":"小江学员007","user_email":"","user_url":"","avatar":"20181008/a45d3066678fa543d47b8a2764814a3a.jpg","realname":"付朋朋","signature":"","last_login_ip":"","user_activation_key":"","mobile":"17791654327","more":null,"age":18,"address":"福建省福州市","driving_type":"","qrcode":"","wx_remind":0,"school_id":8,"coach_id":-1,"openid":"oi2QW0vPuF8H_-QXvSfO84HBb6Jk","coach_qrcode":"0","manager_status":1,"token":"c1fcc1146db895393a78a0878c4429088f7ad3412c63043bf026ec72b0d0acce","user_id":475,"username":"17791654327","password":"###14d708413561564ea702a31205006e58","authentication":0}
     */

    public UserBean userBean;

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

}

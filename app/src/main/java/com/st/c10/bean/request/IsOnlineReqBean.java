package com.st.c10.bean.request;

import com.st.c10.bean.ReqBean;

import java.io.Serializable;

/**
 * @author fpp
 * @Description:  收银机联线检查请求实体
 * @date 2018/11/23 17:00
 */

public class IsOnlineReqBean extends ReqBean implements Serializable {

    private String posVersion;  // 版本号  是

    public String getPosVersion() {
        return posVersion;
    }

    public void setPosVersion(String posVersion) {
        this.posVersion = posVersion;
    }
}

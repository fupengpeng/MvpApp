package com.st.c10.bean.response;

import com.st.c10.bean.RepBean;

import java.io.Serializable;

/**
 * @author fpp
 * @Description:  收银机联线检查响应实体
 * @date 2018/11/23 17:14
 */

public class IsOnlineRepBean extends RepBean implements Serializable {

    private String workDay;  // 工作日
    private String shopNo;  // 分店
    private String serviceId;  // 设备编号
    private String reqDate;  // 请求时间
    private String version;  // 设备版本号
    private String id;  // id


    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

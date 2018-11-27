package com.st.c10.bean;

import java.io.Serializable;

/**
 * @author fpp
 * @Description:  BaseRequest
 * @date 2018/11/22 15:04
 */

public class ReqBean implements Serializable{

    private String funcId;  // 功能编号  是
    private String posNo;  // 终端编号  设备检测时可不传  否
    private String posSn;  // 终端Sn号  设备检测时必须传  否
    private String casherNo;  // 操作员编号  是
    private String reqDate;  // 发起时间  yyyy-MM-dd HH:mm:ss  是
    private String shopNo;  // 分店  是
    private String workday;  // 工作日  是
    private String posMode;  // 收银模式  否  1：统一收银；  2：租赁POS；  3：自主收银；
    private String sign;  // 签名串  是


    public String getFuncId() {
        return funcId;
    }

    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getPosSn() {
        return posSn;
    }

    public void setPosSn(String posSn) {
        this.posSn = posSn;
    }

    public String getCasherNo() {
        return casherNo;
    }

    public void setCasherNo(String casherNo) {
        this.casherNo = casherNo;
    }

    public String getReqDate() {
        return reqDate;
    }

    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getWorkday() {
        return workday;
    }

    public void setWorkday(String workday) {
        this.workday = workday;
    }

    public String getPosMode() {
        return posMode;
    }

    public void setPosMode(String posMode) {
        this.posMode = posMode;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}

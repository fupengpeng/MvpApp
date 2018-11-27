package com.st.c10.bean;


import com.alibaba.fastjson.serializer.SerializeFilter;

/**
 * 请求结果基础bean；仅用于判断操作是否成功
 */
public class RepBean implements SerializeFilter {

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

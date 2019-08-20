package com.lxtech.appdemo.controller.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseController implements Serializable {
    private static final long serialVersionUID = -1539785579570510024L;
    private Map<String, Object> result;

    private String errorCode;//异常
    private String errorCodeMsg;//异常消息
    private String status;//状态
    private Object datas;

    public BaseController() {
        this.result = null;
        this.status = null;
        this.datas = null;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = null;
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = null;
        this.status = status;
    }

    public Object getDatas() {
        return datas == null ? new ArrayList<>() : datas;
    }

    public void setDatas(Object datas) {
        this.datas = null;
        this.datas = datas;
    }

    public Map<String, Object> getResult() {
        result = new HashMap<>();
        result.put("status", getStatus());
        result.put("errorCode", getErrorCode());
        result.put("errorCodeMsg", getErrorCodeMsg());
        result.put("datas", getDatas());
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public String getErrorCodeMsg() {
        return errorCodeMsg;
    }

    public void setErrorCodeMsg(String errorCodeMsg) {
        this.errorCodeMsg = null;
        this.errorCodeMsg = errorCodeMsg;
    }
    public void clear(){
        this.result = null;
        this.status = null;
        this.datas = null;
        this.errorCodeMsg = null;
    }
}

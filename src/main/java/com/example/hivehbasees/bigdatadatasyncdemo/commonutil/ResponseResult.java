package com.example.hivehbasees.bigdatadatasyncdemo.commonutil;


public class ResponseResult {

    private String code;

    private String msg;

    private Object data;

    public ResponseResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static final ResponseResult success() {
        return new ResponseResult("1","","");
    }
    public static final ResponseResult success(String msg,Object obj) {
        return new ResponseResult("1",msg,obj);
    }

    public static final ResponseResult error() {
        return new ResponseResult("0","","");
    }
    public static final ResponseResult error(String msg,Object obj) {
        return new ResponseResult("0",msg,obj);
    }

}

package com.emall.common;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
public enum Status {
//    private int code;
//    private String msg;
//    private T data;
    SUCCESS(0,"成功"),
    FAIL(1,"fail"),
    PARAM(2,"参数不合法"),
    NO_LOGIN(10,"未登录");
    private int state;
    private String msg;

    Status() {
    }

    Status(int state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static  Status stateOf(int index){
        for (Status state:values()){
            if(state.getState()==index){
                return state;
            }
        }
        return  null;
    }

}

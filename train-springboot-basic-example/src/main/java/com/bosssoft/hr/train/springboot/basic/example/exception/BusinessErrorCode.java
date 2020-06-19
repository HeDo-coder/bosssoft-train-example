package com.bosssoft.hr.train.springboot.basic.example.exception;

/**
 * @description: 将系统的错误码定义在枚举类
 * @author: Administrator
 * @create: 2020-06-19 00:44
 * @since
 **/
public enum BusinessErrorCode {

    /**
     *
     */
    FAIL_TO_REGIST_USER(100001,"保存用户失败"),
    /**
     *  以上增加各种码
     */
    UNDEFINE(900000,"未定义");



    /**
     *
     */
    private int code;
    /**
     *
     */
    private String message;

    /**
     *
     * @param code
     * @param message
     */
    BusinessErrorCode(int code,String message) {
        this.code=code;
        this.message=message;
    }

    /**
     *
     * @param code
     * @return
     */
    public static String msg(int code) {
        for (BusinessErrorCode businessErrorCode : BusinessErrorCode.values()) {
            if (businessErrorCode.getCode() == code) {
                return businessErrorCode.message;
            }
        }
        return UNDEFINE.message;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}

package org.example.mp.result;

/**
 * @Author yjz
 * @Date 2021/8/18 10:42
 */
public enum ResultCode {

    SUCCESS(200, "ok"),
    FAIL(500, "err");

    private final Integer code;
    private final String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}

package org.example.mp.result;

import lombok.Data;

/**
 * 通用返回类
 * @author purui
 */
@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;
    private Integer total;

    public static <T> Result ok(T t) {
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(t);
        return result;
    }

    public static <T> Result ok(){
        return ok(null);
    }

    public static <T> Result err(T t) {
        Result result = new Result();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(ResultCode.FAIL.getMsg());
        result.setData(t);
        return result;
    }

    public static <T> Result err(){
        return err(null);
    }

    public static <T> Result res(Integer code, String msg, T t) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(t);
        return result;
    }

}

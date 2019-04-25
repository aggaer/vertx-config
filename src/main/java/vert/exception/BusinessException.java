package vert.exception;

import lombok.Getter;
import vert.enums.ExceptionEnums;

/**
 * @Author Jerry
 * @Date 2019/4/24 16:04
 **/
@Getter
public class BusinessException extends RuntimeException {
    private int code;
    private String msg;

    public BusinessException(String message, int code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(ExceptionEnums exceptionEnums) {
        super(exceptionEnums.getMsg());
        this.code = exceptionEnums.getCode();
        this.msg = exceptionEnums.getMsg();
    }
}

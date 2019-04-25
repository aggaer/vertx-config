package vert.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Jerry
 * @since 2019/4/24 16:08
 **/
@Getter
@NoArgsConstructor
public enum ExceptionEnums {
    //查询结果不存在
    QUERY_RESULT_NOT_EXIST(404, "查询结果不存在");
    private int code;
    private String msg;

    ExceptionEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

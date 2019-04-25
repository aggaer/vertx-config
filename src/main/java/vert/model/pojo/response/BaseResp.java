package vert.model.pojo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jerry
 * @since  2019/4/24 17:10
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseResp {
    public static final String SUCCESS_MSG = "SUCCESS";
    public static final String FAILURE_MSG = "FAILURE";

    public int code;
    public String msg;
}

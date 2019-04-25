package vert.model.pojo.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Author Jerry
 * @Date 2019/4/24 17:26
 **/
@Data
public class TransSendDetailReq {
    @NotEmpty(message = "transId不能为空")
    private String transId;
    @NotEmpty(message = "phone不能为空")
    private String phone;
}

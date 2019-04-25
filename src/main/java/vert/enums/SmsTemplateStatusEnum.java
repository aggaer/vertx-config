package vert.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author Jerry
 * @Date 2019/4/22 18:32
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum SmsTemplateStatusEnum {
    //审核通过
    ACCEPT_SUCC(0, "审核通过"),
    ACCEPTING(1, "审核中"),
    ACCEPT_FAIL(2, "审核驳回"),
    DELETED(3, "已删除"),
    FORBID(4, "已禁用");
    private Integer code;
    private String value;

    public static SmsTemplateStatusEnum getStatusEnumByCode(int code) {
        for (SmsTemplateStatusEnum statusEnum : SmsTemplateStatusEnum.values()) {
            if (code == statusEnum.getCode()) {
                return statusEnum;
            }
        }
        return null;
    }
}

package vert.model.pojo.request;

import lombok.Data;

/**
 * @author Jerry
 * @since 2019/4/28 11:07
 **/
@Data
public abstract class BasePageReq {
    private Integer page = 0;
    private Integer size = 20;
    private String orderBy;
}

package vert.model.pojo.request;

import lombok.Data;

/**
 * @author Jerry
 * @since 2019/4/28 11:07
 **/
@Data
public abstract class BasePageReq {
    private Integer page;
    private Integer size;
    private String orderBy;
}

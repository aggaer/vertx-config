package vert.model.pojo.response;

import io.vertx.core.json.JsonArray;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author Jerry
 * @Date 2019/4/24 17:43
 **/
@Data
@EqualsAndHashCode(callSuper = true)
public class MuitiResp extends BaseResp {
    private JsonArray data;
}

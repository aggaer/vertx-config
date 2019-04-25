package vert.model.pojo.response;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.vertx.core.json.JsonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jerry
 * @since  2019/4/24 17:42
 **/
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MonoResp extends BaseResp implements Serializable {
    private static final long serialVersionUID = 7426492241543618918L;

    private JsonObject data;

    private MonoResp(int code, String msg, JsonObject data) {
        super(code, msg);
        this.data = data;
    }

    public static MonoResp buildSuccessResp(JsonObject data) {
        return new MonoResp(HttpResponseStatus.OK.code(), BaseResp.SUCCESS_MSG, data);
    }
}

package vert.model.pojo.request;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Jerry
 * @since 2019/4/28 11:13
 **/
@Data
@DataObject(generateConverter = true)
@EqualsAndHashCode(callSuper = true)
public class SmsChannelsFetchReq extends BasePageReq implements Serializable {
    private static final long serialVersionUID = -887435637210813943L;

    public SmsChannelsFetchReq(JsonObject jsonObject) {
    }

    private String channelId;

    private String businessType;

    private String channelName;

    private String serviceType;

    private String priority;

    public JsonObject toJson() {
        return JsonObject.mapFrom(this);
    }
}

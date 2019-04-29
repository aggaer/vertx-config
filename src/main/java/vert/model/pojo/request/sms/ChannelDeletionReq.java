package vert.model.pojo.request.sms;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

/**
 * @author Jerry
 * @since 2019/4/29 18:28
 **/
@ToString
@NoArgsConstructor
@SuppressWarnings("ALL")
@DataObject(generateConverter = true)
public class ChannelDeletionReq {

    public ChannelDeletionReq(JsonObject jsonObject) {
        ChannelDeletionReqConverter.fromJson(jsonObject, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        ChannelDeletionReqConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    @NotEmpty(message = "渠道Id不能为空")
    private String channelId;

    @NotEmpty(message = "业务类型不能为空")
    private String businessType;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}

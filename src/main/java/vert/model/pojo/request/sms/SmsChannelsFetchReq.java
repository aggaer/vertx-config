package vert.model.pojo.request.sms;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import lombok.ToString;
import vert.model.pojo.request.BasePageReq;

import java.io.Serializable;

/**
 * @author Jerry
 * @since 2019/4/28 11:13
 **/
@ToString
@SuppressWarnings("ALL")
@DataObject(generateConverter = true)
public class SmsChannelsFetchReq extends BasePageReq implements Serializable {
    private static final long serialVersionUID = -887435637210813943L;

    public SmsChannelsFetchReq(JsonObject jsonObject) {
        SmsChannelsFetchReqConverter.fromJson(jsonObject, this);
    }

    private String channelId;

    private String businessType;

    private String channelName;

    private String serviceType;

    private String priority;

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        SmsChannelsFetchReqConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    public SmsChannelsFetchReq() {
    }

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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}

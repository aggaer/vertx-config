package vert.model.pojo.request.sms;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Jerry
 * @since 2019/4/29 14:13
 **/
@NoArgsConstructor
@SuppressWarnings("ALL")
@DataObject(generateConverter = true)
public class ChannelCreationReq {

    public ChannelCreationReq(JsonObject jsonObject) {
        ChannelCreationReqConverter.fromJson(jsonObject, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        ChannelCreationReqConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    @NotEmpty(message = "channelId不能为空")
    private String channelId;

    @NotEmpty(message = "businessType不能为空")
    private String businessType;

    @NotEmpty(message = "channelName不能为空")
    private String channelName;

    @Min(value = 0, message = "渠道成本必须大于等于0")
    private Integer channelCost;

    private String ipaynowCode;

    private String ipaynowKey;

    private String requestUrl;

    @NotEmpty(message = "开启状态不能为空")
    private String enabled;

    @NotEmpty(message = "业务类型不能为空")
    private String serviceType;

    private String priority;
    /**
     * 渠道账号
     */
    private String account;

    /**
     * 未知短信是否收费
     */
    @NotNull(message = "计费规则不能为空")
    private Integer charge;

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

    public Integer getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(Integer channelCost) {
        this.channelCost = channelCost;
    }

    public String getIpaynowCode() {
        return ipaynowCode;
    }

    public void setIpaynowCode(String ipaynowCode) {
        this.ipaynowCode = ipaynowCode;
    }

    public String getIpaynowKey() {
        return ipaynowKey;
    }

    public void setIpaynowKey(String ipaynowKey) {
        this.ipaynowKey = ipaynowKey;
    }


    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }
}

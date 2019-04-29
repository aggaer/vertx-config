package vert.model.pojo.request.sms;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author Jerry
 * @since 2019/4/29 17:38
 **/
@ToString
@NoArgsConstructor
@SuppressWarnings("ALL")
@DataObject(generateConverter = true)
public class ChannelUpdateReq {

    public ChannelUpdateReq(JsonObject jsonObject) {
        ChannelUpdateReqConverter.fromJson(jsonObject, this);
    }

    public JsonObject toJson() {
        JsonObject jsonObject = new JsonObject();
        ChannelUpdateReqConverter.toJson(this, jsonObject);
        return jsonObject;
    }

    @NotEmpty(message = "渠道Id不能为空")
    private String channelId;

    @NotEmpty(message = "业务类型不能为空")
    private String businessType;

    @NotEmpty(message = "服务类型不能为空")
    private String serviceType;

    @Min(value = 0, message = "渠道成本必须大于等于0")
    private Integer channelCost;

    @NotEmpty(message = "渠道账号不能为空")
    private String account;

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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(Integer channelCost) {
        this.channelCost = channelCost;
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

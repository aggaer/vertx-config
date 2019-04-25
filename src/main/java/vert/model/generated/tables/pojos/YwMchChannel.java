/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import vert.model.generated.tables.interfaces.IYwMchChannel;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class YwMchChannel implements VertxPojo, IYwMchChannel {

    private static final long serialVersionUID = 272892245;

    private String        channelId;
    private String        channelName;
    private Integer       channelCost;
    private String        ipaynowCode;
    private String        ipaynowKey;
    private String        requestUrl;
    private String        enabled;
    private String        businessType;
    private String        serviceType;
    private String        priority;
    private String        account;
    private Boolean       charges;
    private LocalDateTime updateTime;

    public YwMchChannel() {}

    public YwMchChannel(IYwMchChannel value) {
        this.channelId = value.getChannelId();
        this.channelName = value.getChannelName();
        this.channelCost = value.getChannelCost();
        this.ipaynowCode = value.getIpaynowCode();
        this.ipaynowKey = value.getIpaynowKey();
        this.requestUrl = value.getRequestUrl();
        this.enabled = value.getEnabled();
        this.businessType = value.getBusinessType();
        this.serviceType = value.getServiceType();
        this.priority = value.getPriority();
        this.account = value.getAccount();
        this.charges = value.getCharges();
        this.updateTime = value.getUpdateTime();
    }

    public YwMchChannel(
        String        channelId,
        String        channelName,
        Integer       channelCost,
        String        ipaynowCode,
        String        ipaynowKey,
        String        requestUrl,
        String        enabled,
        String        businessType,
        String        serviceType,
        String        priority,
        String        account,
        Boolean       charges,
        LocalDateTime updateTime
    ) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.channelCost = channelCost;
        this.ipaynowCode = ipaynowCode;
        this.ipaynowKey = ipaynowKey;
        this.requestUrl = requestUrl;
        this.enabled = enabled;
        this.businessType = businessType;
        this.serviceType = serviceType;
        this.priority = priority;
        this.account = account;
        this.charges = charges;
        this.updateTime = updateTime;
    }

    @Override
    public String getChannelId() {
        return this.channelId;
    }

    @Override
    public YwMchChannel setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    @Override
    public String getChannelName() {
        return this.channelName;
    }

    @Override
    public YwMchChannel setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    @Override
    public Integer getChannelCost() {
        return this.channelCost;
    }

    @Override
    public YwMchChannel setChannelCost(Integer channelCost) {
        this.channelCost = channelCost;
        return this;
    }

    @Override
    public String getIpaynowCode() {
        return this.ipaynowCode;
    }

    @Override
    public YwMchChannel setIpaynowCode(String ipaynowCode) {
        this.ipaynowCode = ipaynowCode;
        return this;
    }

    @Override
    public String getIpaynowKey() {
        return this.ipaynowKey;
    }

    @Override
    public YwMchChannel setIpaynowKey(String ipaynowKey) {
        this.ipaynowKey = ipaynowKey;
        return this;
    }

    @Override
    public String getRequestUrl() {
        return this.requestUrl;
    }

    @Override
    public YwMchChannel setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    @Override
    public String getEnabled() {
        return this.enabled;
    }

    @Override
    public YwMchChannel setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    @Override
    public String getBusinessType() {
        return this.businessType;
    }

    @Override
    public YwMchChannel setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    @Override
    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public YwMchChannel setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    @Override
    public String getPriority() {
        return this.priority;
    }

    @Override
    public YwMchChannel setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String getAccount() {
        return this.account;
    }

    @Override
    public YwMchChannel setAccount(String account) {
        this.account = account;
        return this;
    }

    @Override
    public Boolean getCharges() {
        return this.charges;
    }

    @Override
    public YwMchChannel setCharges(Boolean charges) {
        this.charges = charges;
        return this;
    }

    @Override
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public YwMchChannel setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("YwMchChannel (");

        sb.append(channelId);
        sb.append(", ").append(channelName);
        sb.append(", ").append(channelCost);
        sb.append(", ").append(ipaynowCode);
        sb.append(", ").append(ipaynowKey);
        sb.append(", ").append(requestUrl);
        sb.append(", ").append(enabled);
        sb.append(", ").append(businessType);
        sb.append(", ").append(serviceType);
        sb.append(", ").append(priority);
        sb.append(", ").append(account);
        sb.append(", ").append(charges);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IYwMchChannel from) {
        setChannelId(from.getChannelId());
        setChannelName(from.getChannelName());
        setChannelCost(from.getChannelCost());
        setIpaynowCode(from.getIpaynowCode());
        setIpaynowKey(from.getIpaynowKey());
        setRequestUrl(from.getRequestUrl());
        setEnabled(from.getEnabled());
        setBusinessType(from.getBusinessType());
        setServiceType(from.getServiceType());
        setPriority(from.getPriority());
        setAccount(from.getAccount());
        setCharges(from.getCharges());
        setUpdateTime(from.getUpdateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IYwMchChannel> E into(E into) {
        into.from(this);
        return into;
    }

    public YwMchChannel(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
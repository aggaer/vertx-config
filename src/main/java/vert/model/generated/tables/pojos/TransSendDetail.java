/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import vert.model.generated.tables.interfaces.ITransSendDetail;


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
public class TransSendDetail implements VertxPojo, ITransSendDetail {

    private static final long serialVersionUID = 1956353920;

    private String  transId;
    private String  mchOrderNo;
    private String  userId;
    private String  appId;
    private String  mchId;
    private String  channelId;
    private String  requestId;
    private String  phone;
    private String  content;
    private String  channelTransId;
    private String  transDate;
    private String  transTime;
    private String  modifyTime;
    private String  acceptStatus;
    private String  acceptFailreason;
    private String  transStatus;
    private String  failreason;
    private String  businessType;
    private String  serviceType;
    private String  notifyUrl;
    private String  smsPhone;
    private String  fee;
    private String  profit;
    private String  channelNotifyTime;
    private Boolean synFlag;
    private String  mchManager;
    private String  mchManagerDept;
    private Boolean splitCount;
    private Boolean newReportStatus;
    private Boolean reportStatus;
    private Integer isCharge;
    private String  notifyTime;
    private String  tempCode;

    public TransSendDetail() {}

    public TransSendDetail(ITransSendDetail value) {
        this.transId = value.getTransId();
        this.mchOrderNo = value.getMchOrderNo();
        this.userId = value.getUserId();
        this.appId = value.getAppId();
        this.mchId = value.getMchId();
        this.channelId = value.getChannelId();
        this.requestId = value.getRequestId();
        this.phone = value.getPhone();
        this.content = value.getContent();
        this.channelTransId = value.getChannelTransId();
        this.transDate = value.getTransDate();
        this.transTime = value.getTransTime();
        this.modifyTime = value.getModifyTime();
        this.acceptStatus = value.getAcceptStatus();
        this.acceptFailreason = value.getAcceptFailreason();
        this.transStatus = value.getTransStatus();
        this.failreason = value.getFailreason();
        this.businessType = value.getBusinessType();
        this.serviceType = value.getServiceType();
        this.notifyUrl = value.getNotifyUrl();
        this.smsPhone = value.getSmsPhone();
        this.fee = value.getFee();
        this.profit = value.getProfit();
        this.channelNotifyTime = value.getChannelNotifyTime();
        this.synFlag = value.getSynFlag();
        this.mchManager = value.getMchManager();
        this.mchManagerDept = value.getMchManagerDept();
        this.splitCount = value.getSplitCount();
        this.newReportStatus = value.getNewReportStatus();
        this.reportStatus = value.getReportStatus();
        this.isCharge = value.getIsCharge();
        this.notifyTime = value.getNotifyTime();
        this.tempCode = value.getTempCode();
    }

    public TransSendDetail(
        String  transId,
        String  mchOrderNo,
        String  userId,
        String  appId,
        String  mchId,
        String  channelId,
        String  requestId,
        String  phone,
        String  content,
        String  channelTransId,
        String  transDate,
        String  transTime,
        String  modifyTime,
        String  acceptStatus,
        String  acceptFailreason,
        String  transStatus,
        String  failreason,
        String  businessType,
        String  serviceType,
        String  notifyUrl,
        String  smsPhone,
        String  fee,
        String  profit,
        String  channelNotifyTime,
        Boolean synFlag,
        String  mchManager,
        String  mchManagerDept,
        Boolean splitCount,
        Boolean newReportStatus,
        Boolean reportStatus,
        Integer isCharge,
        String  notifyTime,
        String  tempCode
    ) {
        this.transId = transId;
        this.mchOrderNo = mchOrderNo;
        this.userId = userId;
        this.appId = appId;
        this.mchId = mchId;
        this.channelId = channelId;
        this.requestId = requestId;
        this.phone = phone;
        this.content = content;
        this.channelTransId = channelTransId;
        this.transDate = transDate;
        this.transTime = transTime;
        this.modifyTime = modifyTime;
        this.acceptStatus = acceptStatus;
        this.acceptFailreason = acceptFailreason;
        this.transStatus = transStatus;
        this.failreason = failreason;
        this.businessType = businessType;
        this.serviceType = serviceType;
        this.notifyUrl = notifyUrl;
        this.smsPhone = smsPhone;
        this.fee = fee;
        this.profit = profit;
        this.channelNotifyTime = channelNotifyTime;
        this.synFlag = synFlag;
        this.mchManager = mchManager;
        this.mchManagerDept = mchManagerDept;
        this.splitCount = splitCount;
        this.newReportStatus = newReportStatus;
        this.reportStatus = reportStatus;
        this.isCharge = isCharge;
        this.notifyTime = notifyTime;
        this.tempCode = tempCode;
    }

    @Override
    public String getTransId() {
        return this.transId;
    }

    @Override
    public TransSendDetail setTransId(String transId) {
        this.transId = transId;
        return this;
    }

    @Override
    public String getMchOrderNo() {
        return this.mchOrderNo;
    }

    @Override
    public TransSendDetail setMchOrderNo(String mchOrderNo) {
        this.mchOrderNo = mchOrderNo;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public TransSendDetail setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getAppId() {
        return this.appId;
    }

    @Override
    public TransSendDetail setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    @Override
    public String getMchId() {
        return this.mchId;
    }

    @Override
    public TransSendDetail setMchId(String mchId) {
        this.mchId = mchId;
        return this;
    }

    @Override
    public String getChannelId() {
        return this.channelId;
    }

    @Override
    public TransSendDetail setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    @Override
    public String getRequestId() {
        return this.requestId;
    }

    @Override
    public TransSendDetail setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

    @Override
    public TransSendDetail setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public TransSendDetail setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String getChannelTransId() {
        return this.channelTransId;
    }

    @Override
    public TransSendDetail setChannelTransId(String channelTransId) {
        this.channelTransId = channelTransId;
        return this;
    }

    @Override
    public String getTransDate() {
        return this.transDate;
    }

    @Override
    public TransSendDetail setTransDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    @Override
    public String getTransTime() {
        return this.transTime;
    }

    @Override
    public TransSendDetail setTransTime(String transTime) {
        this.transTime = transTime;
        return this;
    }

    @Override
    public String getModifyTime() {
        return this.modifyTime;
    }

    @Override
    public TransSendDetail setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    @Override
    public String getAcceptStatus() {
        return this.acceptStatus;
    }

    @Override
    public TransSendDetail setAcceptStatus(String acceptStatus) {
        this.acceptStatus = acceptStatus;
        return this;
    }

    @Override
    public String getAcceptFailreason() {
        return this.acceptFailreason;
    }

    @Override
    public TransSendDetail setAcceptFailreason(String acceptFailreason) {
        this.acceptFailreason = acceptFailreason;
        return this;
    }

    @Override
    public String getTransStatus() {
        return this.transStatus;
    }

    @Override
    public TransSendDetail setTransStatus(String transStatus) {
        this.transStatus = transStatus;
        return this;
    }

    @Override
    public String getFailreason() {
        return this.failreason;
    }

    @Override
    public TransSendDetail setFailreason(String failreason) {
        this.failreason = failreason;
        return this;
    }

    @Override
    public String getBusinessType() {
        return this.businessType;
    }

    @Override
    public TransSendDetail setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    @Override
    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public TransSendDetail setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    @Override
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    @Override
    public TransSendDetail setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    @Override
    public String getSmsPhone() {
        return this.smsPhone;
    }

    @Override
    public TransSendDetail setSmsPhone(String smsPhone) {
        this.smsPhone = smsPhone;
        return this;
    }

    @Override
    public String getFee() {
        return this.fee;
    }

    @Override
    public TransSendDetail setFee(String fee) {
        this.fee = fee;
        return this;
    }

    @Override
    public String getProfit() {
        return this.profit;
    }

    @Override
    public TransSendDetail setProfit(String profit) {
        this.profit = profit;
        return this;
    }

    @Override
    public String getChannelNotifyTime() {
        return this.channelNotifyTime;
    }

    @Override
    public TransSendDetail setChannelNotifyTime(String channelNotifyTime) {
        this.channelNotifyTime = channelNotifyTime;
        return this;
    }

    @Override
    public Boolean getSynFlag() {
        return this.synFlag;
    }

    @Override
    public TransSendDetail setSynFlag(Boolean synFlag) {
        this.synFlag = synFlag;
        return this;
    }

    @Override
    public String getMchManager() {
        return this.mchManager;
    }

    @Override
    public TransSendDetail setMchManager(String mchManager) {
        this.mchManager = mchManager;
        return this;
    }

    @Override
    public String getMchManagerDept() {
        return this.mchManagerDept;
    }

    @Override
    public TransSendDetail setMchManagerDept(String mchManagerDept) {
        this.mchManagerDept = mchManagerDept;
        return this;
    }

    @Override
    public Boolean getSplitCount() {
        return this.splitCount;
    }

    @Override
    public TransSendDetail setSplitCount(Boolean splitCount) {
        this.splitCount = splitCount;
        return this;
    }

    @Override
    public Boolean getNewReportStatus() {
        return this.newReportStatus;
    }

    @Override
    public TransSendDetail setNewReportStatus(Boolean newReportStatus) {
        this.newReportStatus = newReportStatus;
        return this;
    }

    @Override
    public Boolean getReportStatus() {
        return this.reportStatus;
    }

    @Override
    public TransSendDetail setReportStatus(Boolean reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    @Override
    public Integer getIsCharge() {
        return this.isCharge;
    }

    @Override
    public TransSendDetail setIsCharge(Integer isCharge) {
        this.isCharge = isCharge;
        return this;
    }

    @Override
    public String getNotifyTime() {
        return this.notifyTime;
    }

    @Override
    public TransSendDetail setNotifyTime(String notifyTime) {
        this.notifyTime = notifyTime;
        return this;
    }

    @Override
    public String getTempCode() {
        return this.tempCode;
    }

    @Override
    public TransSendDetail setTempCode(String tempCode) {
        this.tempCode = tempCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TransSendDetail (");

        sb.append(transId);
        sb.append(", ").append(mchOrderNo);
        sb.append(", ").append(userId);
        sb.append(", ").append(appId);
        sb.append(", ").append(mchId);
        sb.append(", ").append(channelId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(phone);
        sb.append(", ").append(content);
        sb.append(", ").append(channelTransId);
        sb.append(", ").append(transDate);
        sb.append(", ").append(transTime);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(acceptStatus);
        sb.append(", ").append(acceptFailreason);
        sb.append(", ").append(transStatus);
        sb.append(", ").append(failreason);
        sb.append(", ").append(businessType);
        sb.append(", ").append(serviceType);
        sb.append(", ").append(notifyUrl);
        sb.append(", ").append(smsPhone);
        sb.append(", ").append(fee);
        sb.append(", ").append(profit);
        sb.append(", ").append(channelNotifyTime);
        sb.append(", ").append(synFlag);
        sb.append(", ").append(mchManager);
        sb.append(", ").append(mchManagerDept);
        sb.append(", ").append(splitCount);
        sb.append(", ").append(newReportStatus);
        sb.append(", ").append(reportStatus);
        sb.append(", ").append(isCharge);
        sb.append(", ").append(notifyTime);
        sb.append(", ").append(tempCode);

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
    public void from(ITransSendDetail from) {
        setTransId(from.getTransId());
        setMchOrderNo(from.getMchOrderNo());
        setUserId(from.getUserId());
        setAppId(from.getAppId());
        setMchId(from.getMchId());
        setChannelId(from.getChannelId());
        setRequestId(from.getRequestId());
        setPhone(from.getPhone());
        setContent(from.getContent());
        setChannelTransId(from.getChannelTransId());
        setTransDate(from.getTransDate());
        setTransTime(from.getTransTime());
        setModifyTime(from.getModifyTime());
        setAcceptStatus(from.getAcceptStatus());
        setAcceptFailreason(from.getAcceptFailreason());
        setTransStatus(from.getTransStatus());
        setFailreason(from.getFailreason());
        setBusinessType(from.getBusinessType());
        setServiceType(from.getServiceType());
        setNotifyUrl(from.getNotifyUrl());
        setSmsPhone(from.getSmsPhone());
        setFee(from.getFee());
        setProfit(from.getProfit());
        setChannelNotifyTime(from.getChannelNotifyTime());
        setSynFlag(from.getSynFlag());
        setMchManager(from.getMchManager());
        setMchManagerDept(from.getMchManagerDept());
        setSplitCount(from.getSplitCount());
        setNewReportStatus(from.getNewReportStatus());
        setReportStatus(from.getReportStatus());
        setIsCharge(from.getIsCharge());
        setNotifyTime(from.getNotifyTime());
        setTempCode(from.getTempCode());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITransSendDetail> E into(E into) {
        into.from(this);
        return into;
    }

    public TransSendDetail(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

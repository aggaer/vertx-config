/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import vert.model.generated.tables.interfaces.ITransSend;


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
public class TransSend implements VertxPojo, ITransSend {

    private static final long serialVersionUID = 1609358769;

    private String  transId;
    private String  mchOrderNo;
    private String  userId;
    private String  appId;
    private String  mchId;
    private String  channelId;
    private String  requestId;
    private String  mobile;
    private String  content;
    private String  channelTransId;
    private String  transDate;
    private String  transTime;
    private String  notifyUrl;
    private String  modifyTime;
    private String  businessType;
    private String  serviceType;
    private String  acceptStatus;
    private String  acceptFailreason;
    private String  totalPhoneNo;
    private String  validPhoneNo;
    private String  smsCount;
    private String  fee;
    private String  profit;
    private String  sumFee;
    private String  failCount;
    private String  channelCost;
    private String  smsTitle;
    private String  transStatus;
    private Boolean synFlag;
    private String  mchManager;
    private String  mchManagerDept;
    private Boolean reportStatus;
    private Boolean dataSendStatus;
    private String  tempCode;

    public TransSend() {}

    public TransSend(ITransSend value) {
        this.transId = value.getTransId();
        this.mchOrderNo = value.getMchOrderNo();
        this.userId = value.getUserId();
        this.appId = value.getAppId();
        this.mchId = value.getMchId();
        this.channelId = value.getChannelId();
        this.requestId = value.getRequestId();
        this.mobile = value.getMobile();
        this.content = value.getContent();
        this.channelTransId = value.getChannelTransId();
        this.transDate = value.getTransDate();
        this.transTime = value.getTransTime();
        this.notifyUrl = value.getNotifyUrl();
        this.modifyTime = value.getModifyTime();
        this.businessType = value.getBusinessType();
        this.serviceType = value.getServiceType();
        this.acceptStatus = value.getAcceptStatus();
        this.acceptFailreason = value.getAcceptFailreason();
        this.totalPhoneNo = value.getTotalPhoneNo();
        this.validPhoneNo = value.getValidPhoneNo();
        this.smsCount = value.getSmsCount();
        this.fee = value.getFee();
        this.profit = value.getProfit();
        this.sumFee = value.getSumFee();
        this.failCount = value.getFailCount();
        this.channelCost = value.getChannelCost();
        this.smsTitle = value.getSmsTitle();
        this.transStatus = value.getTransStatus();
        this.synFlag = value.getSynFlag();
        this.mchManager = value.getMchManager();
        this.mchManagerDept = value.getMchManagerDept();
        this.reportStatus = value.getReportStatus();
        this.dataSendStatus = value.getDataSendStatus();
        this.tempCode = value.getTempCode();
    }

    public TransSend(
        String  transId,
        String  mchOrderNo,
        String  userId,
        String  appId,
        String  mchId,
        String  channelId,
        String  requestId,
        String  mobile,
        String  content,
        String  channelTransId,
        String  transDate,
        String  transTime,
        String  notifyUrl,
        String  modifyTime,
        String  businessType,
        String  serviceType,
        String  acceptStatus,
        String  acceptFailreason,
        String  totalPhoneNo,
        String  validPhoneNo,
        String  smsCount,
        String  fee,
        String  profit,
        String  sumFee,
        String  failCount,
        String  channelCost,
        String  smsTitle,
        String  transStatus,
        Boolean synFlag,
        String  mchManager,
        String  mchManagerDept,
        Boolean reportStatus,
        Boolean dataSendStatus,
        String  tempCode
    ) {
        this.transId = transId;
        this.mchOrderNo = mchOrderNo;
        this.userId = userId;
        this.appId = appId;
        this.mchId = mchId;
        this.channelId = channelId;
        this.requestId = requestId;
        this.mobile = mobile;
        this.content = content;
        this.channelTransId = channelTransId;
        this.transDate = transDate;
        this.transTime = transTime;
        this.notifyUrl = notifyUrl;
        this.modifyTime = modifyTime;
        this.businessType = businessType;
        this.serviceType = serviceType;
        this.acceptStatus = acceptStatus;
        this.acceptFailreason = acceptFailreason;
        this.totalPhoneNo = totalPhoneNo;
        this.validPhoneNo = validPhoneNo;
        this.smsCount = smsCount;
        this.fee = fee;
        this.profit = profit;
        this.sumFee = sumFee;
        this.failCount = failCount;
        this.channelCost = channelCost;
        this.smsTitle = smsTitle;
        this.transStatus = transStatus;
        this.synFlag = synFlag;
        this.mchManager = mchManager;
        this.mchManagerDept = mchManagerDept;
        this.reportStatus = reportStatus;
        this.dataSendStatus = dataSendStatus;
        this.tempCode = tempCode;
    }

    @Override
    public String getTransId() {
        return this.transId;
    }

    @Override
    public TransSend setTransId(String transId) {
        this.transId = transId;
        return this;
    }

    @Override
    public String getMchOrderNo() {
        return this.mchOrderNo;
    }

    @Override
    public TransSend setMchOrderNo(String mchOrderNo) {
        this.mchOrderNo = mchOrderNo;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public TransSend setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getAppId() {
        return this.appId;
    }

    @Override
    public TransSend setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    @Override
    public String getMchId() {
        return this.mchId;
    }

    @Override
    public TransSend setMchId(String mchId) {
        this.mchId = mchId;
        return this;
    }

    @Override
    public String getChannelId() {
        return this.channelId;
    }

    @Override
    public TransSend setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    @Override
    public String getRequestId() {
        return this.requestId;
    }

    @Override
    public TransSend setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String getMobile() {
        return this.mobile;
    }

    @Override
    public TransSend setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public TransSend setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String getChannelTransId() {
        return this.channelTransId;
    }

    @Override
    public TransSend setChannelTransId(String channelTransId) {
        this.channelTransId = channelTransId;
        return this;
    }

    @Override
    public String getTransDate() {
        return this.transDate;
    }

    @Override
    public TransSend setTransDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    @Override
    public String getTransTime() {
        return this.transTime;
    }

    @Override
    public TransSend setTransTime(String transTime) {
        this.transTime = transTime;
        return this;
    }

    @Override
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    @Override
    public TransSend setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    @Override
    public String getModifyTime() {
        return this.modifyTime;
    }

    @Override
    public TransSend setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    @Override
    public String getBusinessType() {
        return this.businessType;
    }

    @Override
    public TransSend setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    @Override
    public String getServiceType() {
        return this.serviceType;
    }

    @Override
    public TransSend setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    @Override
    public String getAcceptStatus() {
        return this.acceptStatus;
    }

    @Override
    public TransSend setAcceptStatus(String acceptStatus) {
        this.acceptStatus = acceptStatus;
        return this;
    }

    @Override
    public String getAcceptFailreason() {
        return this.acceptFailreason;
    }

    @Override
    public TransSend setAcceptFailreason(String acceptFailreason) {
        this.acceptFailreason = acceptFailreason;
        return this;
    }

    @Override
    public String getTotalPhoneNo() {
        return this.totalPhoneNo;
    }

    @Override
    public TransSend setTotalPhoneNo(String totalPhoneNo) {
        this.totalPhoneNo = totalPhoneNo;
        return this;
    }

    @Override
    public String getValidPhoneNo() {
        return this.validPhoneNo;
    }

    @Override
    public TransSend setValidPhoneNo(String validPhoneNo) {
        this.validPhoneNo = validPhoneNo;
        return this;
    }

    @Override
    public String getSmsCount() {
        return this.smsCount;
    }

    @Override
    public TransSend setSmsCount(String smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    @Override
    public String getFee() {
        return this.fee;
    }

    @Override
    public TransSend setFee(String fee) {
        this.fee = fee;
        return this;
    }

    @Override
    public String getProfit() {
        return this.profit;
    }

    @Override
    public TransSend setProfit(String profit) {
        this.profit = profit;
        return this;
    }

    @Override
    public String getSumFee() {
        return this.sumFee;
    }

    @Override
    public TransSend setSumFee(String sumFee) {
        this.sumFee = sumFee;
        return this;
    }

    @Override
    public String getFailCount() {
        return this.failCount;
    }

    @Override
    public TransSend setFailCount(String failCount) {
        this.failCount = failCount;
        return this;
    }

    @Override
    public String getChannelCost() {
        return this.channelCost;
    }

    @Override
    public TransSend setChannelCost(String channelCost) {
        this.channelCost = channelCost;
        return this;
    }

    @Override
    public String getSmsTitle() {
        return this.smsTitle;
    }

    @Override
    public TransSend setSmsTitle(String smsTitle) {
        this.smsTitle = smsTitle;
        return this;
    }

    @Override
    public String getTransStatus() {
        return this.transStatus;
    }

    @Override
    public TransSend setTransStatus(String transStatus) {
        this.transStatus = transStatus;
        return this;
    }

    @Override
    public Boolean getSynFlag() {
        return this.synFlag;
    }

    @Override
    public TransSend setSynFlag(Boolean synFlag) {
        this.synFlag = synFlag;
        return this;
    }

    @Override
    public String getMchManager() {
        return this.mchManager;
    }

    @Override
    public TransSend setMchManager(String mchManager) {
        this.mchManager = mchManager;
        return this;
    }

    @Override
    public String getMchManagerDept() {
        return this.mchManagerDept;
    }

    @Override
    public TransSend setMchManagerDept(String mchManagerDept) {
        this.mchManagerDept = mchManagerDept;
        return this;
    }

    @Override
    public Boolean getReportStatus() {
        return this.reportStatus;
    }

    @Override
    public TransSend setReportStatus(Boolean reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    @Override
    public Boolean getDataSendStatus() {
        return this.dataSendStatus;
    }

    @Override
    public TransSend setDataSendStatus(Boolean dataSendStatus) {
        this.dataSendStatus = dataSendStatus;
        return this;
    }

    @Override
    public String getTempCode() {
        return this.tempCode;
    }

    @Override
    public TransSend setTempCode(String tempCode) {
        this.tempCode = tempCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TransSend (");

        sb.append(transId);
        sb.append(", ").append(mchOrderNo);
        sb.append(", ").append(userId);
        sb.append(", ").append(appId);
        sb.append(", ").append(mchId);
        sb.append(", ").append(channelId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(mobile);
        sb.append(", ").append(content);
        sb.append(", ").append(channelTransId);
        sb.append(", ").append(transDate);
        sb.append(", ").append(transTime);
        sb.append(", ").append(notifyUrl);
        sb.append(", ").append(modifyTime);
        sb.append(", ").append(businessType);
        sb.append(", ").append(serviceType);
        sb.append(", ").append(acceptStatus);
        sb.append(", ").append(acceptFailreason);
        sb.append(", ").append(totalPhoneNo);
        sb.append(", ").append(validPhoneNo);
        sb.append(", ").append(smsCount);
        sb.append(", ").append(fee);
        sb.append(", ").append(profit);
        sb.append(", ").append(sumFee);
        sb.append(", ").append(failCount);
        sb.append(", ").append(channelCost);
        sb.append(", ").append(smsTitle);
        sb.append(", ").append(transStatus);
        sb.append(", ").append(synFlag);
        sb.append(", ").append(mchManager);
        sb.append(", ").append(mchManagerDept);
        sb.append(", ").append(reportStatus);
        sb.append(", ").append(dataSendStatus);
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
    public void from(ITransSend from) {
        setTransId(from.getTransId());
        setMchOrderNo(from.getMchOrderNo());
        setUserId(from.getUserId());
        setAppId(from.getAppId());
        setMchId(from.getMchId());
        setChannelId(from.getChannelId());
        setRequestId(from.getRequestId());
        setMobile(from.getMobile());
        setContent(from.getContent());
        setChannelTransId(from.getChannelTransId());
        setTransDate(from.getTransDate());
        setTransTime(from.getTransTime());
        setNotifyUrl(from.getNotifyUrl());
        setModifyTime(from.getModifyTime());
        setBusinessType(from.getBusinessType());
        setServiceType(from.getServiceType());
        setAcceptStatus(from.getAcceptStatus());
        setAcceptFailreason(from.getAcceptFailreason());
        setTotalPhoneNo(from.getTotalPhoneNo());
        setValidPhoneNo(from.getValidPhoneNo());
        setSmsCount(from.getSmsCount());
        setFee(from.getFee());
        setProfit(from.getProfit());
        setSumFee(from.getSumFee());
        setFailCount(from.getFailCount());
        setChannelCost(from.getChannelCost());
        setSmsTitle(from.getSmsTitle());
        setTransStatus(from.getTransStatus());
        setSynFlag(from.getSynFlag());
        setMchManager(from.getMchManager());
        setMchManagerDept(from.getMchManagerDept());
        setReportStatus(from.getReportStatus());
        setDataSendStatus(from.getDataSendStatus());
        setTempCode(from.getTempCode());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ITransSend> E into(E into) {
        into.from(this);
        return into;
    }

    public TransSend(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

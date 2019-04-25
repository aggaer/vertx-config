/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;

import vert.model.generated.tables.SmsTemplate;
import vert.model.generated.tables.interfaces.ISmsTemplate;


/**
 * 短信模板
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SmsTemplateRecord extends UpdatableRecordImpl<SmsTemplateRecord> implements VertxPojo, Record21<Integer, String, String, LocalDateTime, LocalDateTime, String, String, Integer, String, Integer, String, String, Integer, Integer, String, String, LocalDateTime, String, String, String, Integer>, ISmsTemplate {

    private static final long serialVersionUID = -690492991;

    /**
     * Setter for <code>sms.sms_template.ID</code>. 自增主键
     */
    @Override
    public SmsTemplateRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.ID</code>. 自增主键
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sms.sms_template.MCH_ID</code>. 商户号
     */
    @Override
    public SmsTemplateRecord setMchId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.MCH_ID</code>. 商户号
     */
    @Override
    public String getMchId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sms.sms_template.MCH_NAME</code>. 商户名称
     */
    @Override
    public SmsTemplateRecord setMchName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.MCH_NAME</code>. 商户名称
     */
    @Override
    public String getMchName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sms.sms_template.CREATED_TIME</code>. 创建时间
     */
    @Override
    public SmsTemplateRecord setCreatedTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.CREATED_TIME</code>. 创建时间
     */
    @Override
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>sms.sms_template.UPDATE_TIME</code>. 修改时间
     */
    @Override
    public SmsTemplateRecord setUpdateTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.UPDATE_TIME</code>. 修改时间
     */
    @Override
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_NAME</code>. 模板名称
     */
    @Override
    public SmsTemplateRecord setTempName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_NAME</code>. 模板名称
     */
    @Override
    public String getTempName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_CODE</code>. 模板编码
     */
    @Override
    public SmsTemplateRecord setTempCode(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_CODE</code>. 模板编码
     */
    @Override
    public String getTempCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_TYPE</code>. 模板类型 0 行业短信，1 营销短信
     */
    @Override
    public SmsTemplateRecord setTempType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_TYPE</code>. 模板类型 0 行业短信，1 营销短信
     */
    @Override
    public Integer getTempType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_SIGNATURE</code>. 模板签名
     */
    @Override
    public SmsTemplateRecord setTempSignature(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_SIGNATURE</code>. 模板签名
     */
    @Override
    public String getTempSignature() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_SIGNATURE_TYPE</code>. 签名类型 1 前置签名 2 后置签名
     */
    @Override
    public SmsTemplateRecord setTempSignatureType(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_SIGNATURE_TYPE</code>. 签名类型 1 前置签名 2 后置签名
     */
    @Override
    public Integer getTempSignatureType() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_CONTENT</code>. 模板内容
     */
    @Override
    public SmsTemplateRecord setTempContent(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_CONTENT</code>. 模板内容
     */
    @Override
    public String getTempContent() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sms.sms_template.REMARK</code>. 备注
     */
    @Override
    public SmsTemplateRecord setRemark(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.REMARK</code>. 备注
     */
    @Override
    public String getRemark() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_STATUS</code>. 模板状态 0.审核通过 1 待审核 2 审核驳回 3 逻辑删除  4禁用 
     */
    @Override
    public SmsTemplateRecord setTempStatus(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_STATUS</code>. 模板状态 0.审核通过 1 待审核 2 审核驳回 3 逻辑删除  4禁用 
     */
    @Override
    public Integer getTempStatus() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>sms.sms_template.ENABLED</code>. 0 启用 1禁用
     */
    @Override
    public SmsTemplateRecord setEnabled(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.ENABLED</code>. 0 启用 1禁用
     */
    @Override
    public Integer getEnabled() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>sms.sms_template.CHANNEL_ID</code>. 通道ID
     */
    @Override
    public SmsTemplateRecord setChannelId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.CHANNEL_ID</code>. 通道ID
     */
    @Override
    public String getChannelId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sms.sms_template.CHANNEL_NAME</code>. 通道名称
     */
    @Override
    public SmsTemplateRecord setChannelName(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.CHANNEL_NAME</code>. 通道名称
     */
    @Override
    public String getChannelName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sms.sms_template.ACCEPT_TIME</code>. 审核时间
     */
    @Override
    public SmsTemplateRecord setAcceptTime(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.ACCEPT_TIME</code>. 审核时间
     */
    @Override
    public LocalDateTime getAcceptTime() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>sms.sms_template.ACCEPT_PERSON_CODE</code>. 审核人编号
     */
    @Override
    public SmsTemplateRecord setAcceptPersonCode(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.ACCEPT_PERSON_CODE</code>. 审核人编号
     */
    @Override
    public String getAcceptPersonCode() {
        return (String) get(17);
    }

    /**
     * Setter for <code>sms.sms_template.ACCEPT_PERSON_NAME</code>. 审核人名字
     */
    @Override
    public SmsTemplateRecord setAcceptPersonName(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.ACCEPT_PERSON_NAME</code>. 审核人名字
     */
    @Override
    public String getAcceptPersonName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>sms.sms_template.REVIEW_FAIL_RESON</code>. 驳回原因
     */
    @Override
    public SmsTemplateRecord setReviewFailReson(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.REVIEW_FAIL_RESON</code>. 驳回原因
     */
    @Override
    public String getReviewFailReson() {
        return (String) get(19);
    }

    /**
     * Setter for <code>sms.sms_template.TEMP_CONTENT_TYPE</code>. 模板内容类型 1固定内容 2变量内容 0默认
     */
    @Override
    public SmsTemplateRecord setTempContentType(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>sms.sms_template.TEMP_CONTENT_TYPE</code>. 模板内容类型 1固定内容 2变量内容 0默认
     */
    @Override
    public Integer getTempContentType() {
        return (Integer) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, String, LocalDateTime, LocalDateTime, String, String, Integer, String, Integer, String, String, Integer, Integer, String, String, LocalDateTime, String, String, String, Integer> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, String, LocalDateTime, LocalDateTime, String, String, Integer, String, Integer, String, String, Integer, Integer, String, String, LocalDateTime, String, String, String, Integer> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SmsTemplate.SMS_TEMPLATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SmsTemplate.SMS_TEMPLATE.MCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SmsTemplate.SMS_TEMPLATE.MCH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return SmsTemplate.SMS_TEMPLATE.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return SmsTemplate.SMS_TEMPLATE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_SIGNATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_SIGNATURE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SmsTemplate.SMS_TEMPLATE.REMARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return SmsTemplate.SMS_TEMPLATE.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SmsTemplate.SMS_TEMPLATE.CHANNEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return SmsTemplate.SMS_TEMPLATE.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field17() {
        return SmsTemplate.SMS_TEMPLATE.ACCEPT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return SmsTemplate.SMS_TEMPLATE.ACCEPT_PERSON_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return SmsTemplate.SMS_TEMPLATE.ACCEPT_PERSON_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return SmsTemplate.SMS_TEMPLATE.REVIEW_FAIL_RESON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field21() {
        return SmsTemplate.SMS_TEMPLATE.TEMP_CONTENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMchName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTempName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTempCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getTempType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTempSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTempSignatureType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTempContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getTempStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component17() {
        return getAcceptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getAcceptPersonCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getAcceptPersonName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getReviewFailReson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component21() {
        return getTempContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMchName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTempName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTempCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getTempType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTempSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTempSignatureType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTempContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRemark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getTempStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value17() {
        return getAcceptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getAcceptPersonCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getAcceptPersonName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getReviewFailReson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value21() {
        return getTempContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value2(String value) {
        setMchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value3(String value) {
        setMchName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value4(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value5(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value6(String value) {
        setTempName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value7(String value) {
        setTempCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value8(Integer value) {
        setTempType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value9(String value) {
        setTempSignature(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value10(Integer value) {
        setTempSignatureType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value11(String value) {
        setTempContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value12(String value) {
        setRemark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value13(Integer value) {
        setTempStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value14(Integer value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value15(String value) {
        setChannelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value16(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value17(LocalDateTime value) {
        setAcceptTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value18(String value) {
        setAcceptPersonCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value19(String value) {
        setAcceptPersonName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value20(String value) {
        setReviewFailReson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord value21(Integer value) {
        setTempContentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsTemplateRecord values(Integer value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, String value6, String value7, Integer value8, String value9, Integer value10, String value11, String value12, Integer value13, Integer value14, String value15, String value16, LocalDateTime value17, String value18, String value19, String value20, Integer value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISmsTemplate from) {
        setId(from.getId());
        setMchId(from.getMchId());
        setMchName(from.getMchName());
        setCreatedTime(from.getCreatedTime());
        setUpdateTime(from.getUpdateTime());
        setTempName(from.getTempName());
        setTempCode(from.getTempCode());
        setTempType(from.getTempType());
        setTempSignature(from.getTempSignature());
        setTempSignatureType(from.getTempSignatureType());
        setTempContent(from.getTempContent());
        setRemark(from.getRemark());
        setTempStatus(from.getTempStatus());
        setEnabled(from.getEnabled());
        setChannelId(from.getChannelId());
        setChannelName(from.getChannelName());
        setAcceptTime(from.getAcceptTime());
        setAcceptPersonCode(from.getAcceptPersonCode());
        setAcceptPersonName(from.getAcceptPersonName());
        setReviewFailReson(from.getReviewFailReson());
        setTempContentType(from.getTempContentType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISmsTemplate> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmsTemplateRecord
     */
    public SmsTemplateRecord() {
        super(SmsTemplate.SMS_TEMPLATE);
    }

    /**
     * Create a detached, initialised SmsTemplateRecord
     */
    public SmsTemplateRecord(Integer id, String mchId, String mchName, LocalDateTime createdTime, LocalDateTime updateTime, String tempName, String tempCode, Integer tempType, String tempSignature, Integer tempSignatureType, String tempContent, String remark, Integer tempStatus, Integer enabled, String channelId, String channelName, LocalDateTime acceptTime, String acceptPersonCode, String acceptPersonName, String reviewFailReson, Integer tempContentType) {
        super(SmsTemplate.SMS_TEMPLATE);

        set(0, id);
        set(1, mchId);
        set(2, mchName);
        set(3, createdTime);
        set(4, updateTime);
        set(5, tempName);
        set(6, tempCode);
        set(7, tempType);
        set(8, tempSignature);
        set(9, tempSignatureType);
        set(10, tempContent);
        set(11, remark);
        set(12, tempStatus);
        set(13, enabled);
        set(14, channelId);
        set(15, channelName);
        set(16, acceptTime);
        set(17, acceptPersonCode);
        set(18, acceptPersonName);
        set(19, reviewFailReson);
        set(20, tempContentType);
    }

    public SmsTemplateRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

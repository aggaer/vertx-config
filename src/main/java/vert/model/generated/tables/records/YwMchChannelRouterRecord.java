/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import vert.model.generated.tables.YwMchChannelRouter;
import vert.model.generated.tables.interfaces.IYwMchChannelRouter;


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
public class YwMchChannelRouterRecord extends UpdatableRecordImpl<YwMchChannelRouterRecord> implements VertxPojo, Record4<String, String, String, String>, IYwMchChannelRouter {

    private static final long serialVersionUID = 1803414903;

    /**
     * Setter for <code>sms.yw_mch_channel_router.MCH_ID</code>. 商户Id
     */
    @Override
    public YwMchChannelRouterRecord setMchId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sms.yw_mch_channel_router.MCH_ID</code>. 商户Id
     */
    @Override
    public String getMchId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sms.yw_mch_channel_router.CHANNEL_ID</code>.
     */
    @Override
    public YwMchChannelRouterRecord setChannelId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sms.yw_mch_channel_router.CHANNEL_ID</code>.
     */
    @Override
    public String getChannelId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sms.yw_mch_channel_router.CHANNEL_NAME</code>.
     */
    @Override
    public YwMchChannelRouterRecord setChannelName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sms.yw_mch_channel_router.CHANNEL_NAME</code>.
     */
    @Override
    public String getChannelName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sms.yw_mch_channel_router.BUSINESS_TYPE</code>. 业务类型
     */
    @Override
    public YwMchChannelRouterRecord setBusinessType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sms.yw_mch_channel_router.BUSINESS_TYPE</code>. 业务类型
     */
    @Override
    public String getBusinessType() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER.MCH_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER.CHANNEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER.BUSINESS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getMchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBusinessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getMchId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getChannelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBusinessType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YwMchChannelRouterRecord value1(String value) {
        setMchId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YwMchChannelRouterRecord value2(String value) {
        setChannelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YwMchChannelRouterRecord value3(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YwMchChannelRouterRecord value4(String value) {
        setBusinessType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public YwMchChannelRouterRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IYwMchChannelRouter from) {
        setMchId(from.getMchId());
        setChannelId(from.getChannelId());
        setChannelName(from.getChannelName());
        setBusinessType(from.getBusinessType());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IYwMchChannelRouter> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached YwMchChannelRouterRecord
     */
    public YwMchChannelRouterRecord() {
        super(YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER);
    }

    /**
     * Create a detached, initialised YwMchChannelRouterRecord
     */
    public YwMchChannelRouterRecord(String mchId, String channelId, String channelName, String businessType) {
        super(YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER);

        set(0, mchId);
        set(1, channelId);
        set(2, channelName);
        set(3, businessType);
    }

    public YwMchChannelRouterRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;

import vert.model.generated.tables.TransSendDetail;
import vert.model.generated.tables.records.TransSendDetailRecord;


import io.vertx.core.Future;
import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicQueryExecutor;
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
public class TransSendDetailDao extends AbstractAsyncVertxDAO<TransSendDetailRecord, vert.model.generated.tables.pojos.TransSendDetail, Record2<String, String>, Future<List<vert.model.generated.tables.pojos.TransSendDetail>>, Future<vert.model.generated.tables.pojos.TransSendDetail>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TransSendDetailRecord,vert.model.generated.tables.pojos.TransSendDetail,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TransSendDetailDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(TransSendDetail.TRANS_SEND_DETAIL, vert.model.generated.tables.pojos.TransSendDetail.class, new AsyncClassicQueryExecutor<TransSendDetailRecord,vert.model.generated.tables.pojos.TransSendDetail,Record2<String, String>>(configuration,delegate,vert.model.generated.tables.pojos.TransSendDetail::new, TransSendDetail.TRANS_SEND_DETAIL));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(vert.model.generated.tables.pojos.TransSendDetail object) {
        return compositeKeyRecord(object.getTransId(), object.getPhone());
    }

    /**
     * Find records that have <code>MCH_ORDER_NO IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByMchOrderNo(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.MCH_ORDER_NO.in(values));
    }

    /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByUserId(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.USER_ID.in(values));
    }

    /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByAppId(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.APP_ID.in(values));
    }

    /**
     * Find records that have <code>MCH_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByMchId(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.MCH_ID.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByChannelId(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.CHANNEL_ID.in(values));
    }

    /**
     * Find records that have <code>REQUEST_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByRequestId(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.REQUEST_ID.in(values));
    }

    /**
     * Find records that have <code>PHONE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByPhone(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.PHONE.in(values));
    }

    /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByContent(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.CONTENT.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_TRANS_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByChannelTransId(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.CHANNEL_TRANS_ID.in(values));
    }

    /**
     * Find records that have <code>TRANS_DATE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByTransDate(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.TRANS_DATE.in(values));
    }

    /**
     * Find records that have <code>TRANS_TIME IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByTransTime(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.TRANS_TIME.in(values));
    }

    /**
     * Find records that have <code>MODIFY_TIME IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByModifyTime(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.MODIFY_TIME.in(values));
    }

    /**
     * Find records that have <code>ACCEPT_STATUS IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByAcceptStatus(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.ACCEPT_STATUS.in(values));
    }

    /**
     * Find records that have <code>ACCEPT_FAILREASON IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByAcceptFailreason(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.ACCEPT_FAILREASON.in(values));
    }

    /**
     * Find records that have <code>TRANS_STATUS IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByTransStatus(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.TRANS_STATUS.in(values));
    }

    /**
     * Find records that have <code>FAILREASON IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByFailreason(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.FAILREASON.in(values));
    }

    /**
     * Find records that have <code>BUSINESS_TYPE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByBusinessType(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.BUSINESS_TYPE.in(values));
    }

    /**
     * Find records that have <code>SERVICE_TYPE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByServiceType(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.SERVICE_TYPE.in(values));
    }

    /**
     * Find records that have <code>NOTIFY_URL IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByNotifyUrl(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.NOTIFY_URL.in(values));
    }

    /**
     * Find records that have <code>SMS_PHONE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyBySmsPhone(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.SMS_PHONE.in(values));
    }

    /**
     * Find records that have <code>FEE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByFee(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.FEE.in(values));
    }

    /**
     * Find records that have <code>PROFIT IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByProfit(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.PROFIT.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_NOTIFY_TIME IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByChannelNotifyTime(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.CHANNEL_NOTIFY_TIME.in(values));
    }

    /**
     * Find records that have <code>SYN_FLAG IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyBySynFlag(List<Boolean> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.SYN_FLAG.in(values));
    }

    /**
     * Find records that have <code>mch_manager IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByMchManager(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.MCH_MANAGER.in(values));
    }

    /**
     * Find records that have <code>mch_manager_dept IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByMchManagerDept(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.MCH_MANAGER_DEPT.in(values));
    }

    /**
     * Find records that have <code>split_count IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyBySplitCount(List<Boolean> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.SPLIT_COUNT.in(values));
    }

    /**
     * Find records that have <code>report_status IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByReportStatus(List<Boolean> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.REPORT_STATUS.in(values));
    }

    /**
     * Find records that have <code>is_charge IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByIsCharge(List<Integer> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.IS_CHARGE.in(values));
    }

    /**
     * Find records that have <code>notify_time IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByNotifyTime(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.NOTIFY_TIME.in(values));
    }

    /**
     * Find records that have <code>TEMP_CODE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByTempCode(List<String> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.TEMP_CODE.in(values));
    }

    /**
     * Find records that have <code>new_report_status IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSendDetail>> findManyByNewReportStatus(List<Boolean> values) {
        return findManyByCondition(TransSendDetail.TRANS_SEND_DETAIL.NEW_REPORT_STATUS.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<TransSendDetailRecord,vert.model.generated.tables.pojos.TransSendDetail,Record2<String, String>> queryExecutor(){
        return (AsyncClassicQueryExecutor<TransSendDetailRecord,vert.model.generated.tables.pojos.TransSendDetail,Record2<String, String>>) super.queryExecutor();
    }
}

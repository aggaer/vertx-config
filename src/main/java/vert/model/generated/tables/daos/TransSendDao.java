/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;

import vert.model.generated.tables.TransSend;
import vert.model.generated.tables.records.TransSendRecord;


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
public class TransSendDao extends AbstractAsyncVertxDAO<TransSendRecord, vert.model.generated.tables.pojos.TransSend, String, Future<List<vert.model.generated.tables.pojos.TransSend>>, Future<vert.model.generated.tables.pojos.TransSend>, Future<Integer>, Future<String>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<TransSendRecord,vert.model.generated.tables.pojos.TransSend,String> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public TransSendDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(TransSend.TRANS_SEND, vert.model.generated.tables.pojos.TransSend.class, new AsyncClassicQueryExecutor<TransSendRecord,vert.model.generated.tables.pojos.TransSend,String>(configuration,delegate,vert.model.generated.tables.pojos.TransSend::new, TransSend.TRANS_SEND));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(vert.model.generated.tables.pojos.TransSend object) {
        return object.getTransId();
    }

    /**
     * Find records that have <code>MCH_ORDER_NO IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByMchOrderNo(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.MCH_ORDER_NO.in(values));
    }

    /**
     * Find records that have <code>USER_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByUserId(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.USER_ID.in(values));
    }

    /**
     * Find records that have <code>APP_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByAppId(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.APP_ID.in(values));
    }

    /**
     * Find records that have <code>MCH_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByMchId(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.MCH_ID.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByChannelId(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.CHANNEL_ID.in(values));
    }

    /**
     * Find records that have <code>REQUEST_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByRequestId(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.REQUEST_ID.in(values));
    }

    /**
     * Find records that have <code>MOBILE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByMobile(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.MOBILE.in(values));
    }

    /**
     * Find records that have <code>CONTENT IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByContent(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.CONTENT.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_TRANS_ID IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByChannelTransId(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.CHANNEL_TRANS_ID.in(values));
    }

    /**
     * Find records that have <code>TRANS_DATE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByTransDate(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.TRANS_DATE.in(values));
    }

    /**
     * Find records that have <code>TRANS_TIME IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByTransTime(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.TRANS_TIME.in(values));
    }

    /**
     * Find records that have <code>NOTIFY_URL IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByNotifyUrl(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.NOTIFY_URL.in(values));
    }

    /**
     * Find records that have <code>MODIFY_TIME IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByModifyTime(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.MODIFY_TIME.in(values));
    }

    /**
     * Find records that have <code>BUSINESS_TYPE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByBusinessType(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.BUSINESS_TYPE.in(values));
    }

    /**
     * Find records that have <code>SERVICE_TYPE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByServiceType(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.SERVICE_TYPE.in(values));
    }

    /**
     * Find records that have <code>ACCEPT_STATUS IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByAcceptStatus(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.ACCEPT_STATUS.in(values));
    }

    /**
     * Find records that have <code>ACCEPT_FAILREASON IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByAcceptFailreason(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.ACCEPT_FAILREASON.in(values));
    }

    /**
     * Find records that have <code>TOTAL_PHONE_NO IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByTotalPhoneNo(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.TOTAL_PHONE_NO.in(values));
    }

    /**
     * Find records that have <code>VALID_PHONE_NO IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByValidPhoneNo(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.VALID_PHONE_NO.in(values));
    }

    /**
     * Find records that have <code>SMS_COUNT IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyBySmsCount(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.SMS_COUNT.in(values));
    }

    /**
     * Find records that have <code>FEE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByFee(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.FEE.in(values));
    }

    /**
     * Find records that have <code>PROFIT IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByProfit(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.PROFIT.in(values));
    }

    /**
     * Find records that have <code>SUM_FEE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyBySumFee(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.SUM_FEE.in(values));
    }

    /**
     * Find records that have <code>FAIL_COUNT IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByFailCount(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.FAIL_COUNT.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_COST IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByChannelCost(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.CHANNEL_COST.in(values));
    }

    /**
     * Find records that have <code>SMS_TITLE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyBySmsTitle(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.SMS_TITLE.in(values));
    }

    /**
     * Find records that have <code>TRANS_STATUS IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByTransStatus(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.TRANS_STATUS.in(values));
    }

    /**
     * Find records that have <code>SYN_FLAG IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyBySynFlag(List<Boolean> values) {
        return findManyByCondition(TransSend.TRANS_SEND.SYN_FLAG.in(values));
    }

    /**
     * Find records that have <code>mch_manager IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByMchManager(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.MCH_MANAGER.in(values));
    }

    /**
     * Find records that have <code>mch_manager_dept IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByMchManagerDept(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.MCH_MANAGER_DEPT.in(values));
    }

    /**
     * Find records that have <code>report_status IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByReportStatus(List<Boolean> values) {
        return findManyByCondition(TransSend.TRANS_SEND.REPORT_STATUS.in(values));
    }

    /**
     * Find records that have <code>data_send_status IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByDataSendStatus(List<Boolean> values) {
        return findManyByCondition(TransSend.TRANS_SEND.DATA_SEND_STATUS.in(values));
    }

    /**
     * Find records that have <code>TEMP_CODE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.TransSend>> findManyByTempCode(List<String> values) {
        return findManyByCondition(TransSend.TRANS_SEND.TEMP_CODE.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<TransSendRecord,vert.model.generated.tables.pojos.TransSend,String> queryExecutor(){
        return (AsyncClassicQueryExecutor<TransSendRecord,vert.model.generated.tables.pojos.TransSend,String>) super.queryExecutor();
    }
}
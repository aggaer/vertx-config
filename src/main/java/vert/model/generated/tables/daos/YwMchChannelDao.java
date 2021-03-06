/*
 * This file is generated by jOOQ.
 */
package vert.model.generated.tables.daos;


import io.github.jklingsporn.vertx.jooq.shared.async.AbstractAsyncVertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;

import vert.model.generated.tables.YwMchChannel;
import vert.model.generated.tables.records.YwMchChannelRecord;


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
public class YwMchChannelDao extends AbstractAsyncVertxDAO<YwMchChannelRecord, vert.model.generated.tables.pojos.YwMchChannel, Record2<String, String>, Future<List<vert.model.generated.tables.pojos.YwMchChannel>>, Future<vert.model.generated.tables.pojos.YwMchChannel>, Future<Integer>, Future<Record2<String, String>>> implements io.github.jklingsporn.vertx.jooq.classic.VertxDAO<YwMchChannelRecord,vert.model.generated.tables.pojos.YwMchChannel,Record2<String, String>> {

    /**
     * @param configuration Used for rendering, so only SQLDialect must be set and must be one of the MYSQL types or POSTGRES.
     * @param delegate A configured AsyncSQLClient that is used for query execution
     */
    public YwMchChannelDao(Configuration configuration, io.vertx.ext.asyncsql.AsyncSQLClient delegate) {
        super(YwMchChannel.YW_MCH_CHANNEL, vert.model.generated.tables.pojos.YwMchChannel.class, new AsyncClassicQueryExecutor<YwMchChannelRecord,vert.model.generated.tables.pojos.YwMchChannel,Record2<String, String>>(configuration,delegate,vert.model.generated.tables.pojos.YwMchChannel::new, YwMchChannel.YW_MCH_CHANNEL));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(vert.model.generated.tables.pojos.YwMchChannel object) {
        return compositeKeyRecord(object.getChannelId(), object.getBusinessType());
    }

    /**
     * Find records that have <code>CHANNEL_NAME IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByChannelName(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.CHANNEL_NAME.in(values));
    }

    /**
     * Find records that have <code>CHANNEL_COST IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByChannelCost(List<Integer> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.CHANNEL_COST.in(values));
    }

    /**
     * Find records that have <code>IPAYNOW_CODE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByIpaynowCode(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.IPAYNOW_CODE.in(values));
    }

    /**
     * Find records that have <code>IPAYNOW_KEY IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByIpaynowKey(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.IPAYNOW_KEY.in(values));
    }

    /**
     * Find records that have <code>REQUEST_URL IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByRequestUrl(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.REQUEST_URL.in(values));
    }

    /**
     * Find records that have <code>ENABLED IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByEnabled(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.ENABLED.in(values));
    }

    /**
     * Find records that have <code>BUSINESS_TYPE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByBusinessType(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.BUSINESS_TYPE.in(values));
    }

    /**
     * Find records that have <code>SERVICE_TYPE IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByServiceType(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.SERVICE_TYPE.in(values));
    }

    /**
     * Find records that have <code>PRIORITY IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByPriority(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.PRIORITY.in(values));
    }

    /**
     * Find records that have <code>account IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByAccount(List<String> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.ACCOUNT.in(values));
    }

    /**
     * Find records that have <code>charges IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByCharges(List<Boolean> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.CHARGES.in(values));
    }

    /**
     * Find records that have <code>update_time IN (values)</code> asynchronously
     */
    public Future<List<vert.model.generated.tables.pojos.YwMchChannel>> findManyByUpdateTime(List<LocalDateTime> values) {
        return findManyByCondition(YwMchChannel.YW_MCH_CHANNEL.UPDATE_TIME.in(values));
    }

    @Override
    public AsyncClassicQueryExecutor<YwMchChannelRecord,vert.model.generated.tables.pojos.YwMchChannel,Record2<String, String>> queryExecutor(){
        return (AsyncClassicQueryExecutor<YwMchChannelRecord,vert.model.generated.tables.pojos.YwMchChannel,Record2<String, String>>) super.queryExecutor();
    }
}

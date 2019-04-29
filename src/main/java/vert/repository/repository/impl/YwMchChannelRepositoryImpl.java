package vert.repository.repository.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import lombok.extern.slf4j.Slf4j;
import org.jooq.SelectQuery;
import vert.model.generated.Tables;
import vert.model.generated.tables.daos.YwMchChannelDao;
import vert.model.generated.tables.pojos.YwMchChannel;
import vert.model.generated.tables.records.YwMchChannelRecord;
import vert.model.pojo.request.sms.ChannelCreationReq;
import vert.model.pojo.request.sms.ChannelUpdateReq;
import vert.model.pojo.request.sms.SmsChannelsFetchReq;
import vert.repository.repository.BaseRepository;
import vert.repository.repository.YwMchChannelRepository;
import vert.utils.HandlerRespComposer;
import vert.utils.JooqConfigUtils;

import java.util.List;
import java.util.Objects;

import static vert.model.generated.Tables.YW_MCH_CHANNEL;

/**
 * @author Jerry
 * @since 2019/4/28 11:41
 **/
@Slf4j
public class YwMchChannelRepositoryImpl extends BaseRepository implements YwMchChannelRepository {
    private YwMchChannelDao ywMchChannelDao;

    public YwMchChannelRepositoryImpl(AsyncSQLClient asyncSQLClient) {
        super(asyncSQLClient);
        ywMchChannelDao = new YwMchChannelDao(JooqConfigUtils.getDefaultConfig(), asyncSQLClient);
    }

    @Override
    public YwMchChannelRepository findByConditions(SmsChannelsFetchReq conditions, Handler<AsyncResult<JsonArray>> future) {
        log.info("YwMchChannelRepository.findByConditions conditions:{}", conditions);
        Future<List<JsonObject>> resultFuture = queryExecutor.findManyJson(dslContext -> {
            SelectQuery<YwMchChannelRecord> selectQuery = dslContext.selectQuery(YW_MCH_CHANNEL);
            if (Objects.nonNull(conditions.getChannelId())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.CHANNEL_ID.eq(conditions.getChannelId()));
            }
            if (Objects.nonNull(conditions.getBusinessType())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.BUSINESS_TYPE.eq(conditions.getBusinessType()));
            }
            if (Objects.nonNull(conditions.getChannelName())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.CHANNEL_NAME.likeIgnoreCase("%" + conditions.getChannelName() + "%"));
            }
            if (Objects.nonNull(conditions.getServiceType())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.SERVICE_TYPE.eq(conditions.getServiceType()));
            }
            if (Objects.nonNull(conditions.getPriority())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.PRIORITY.eq(conditions.getPriority()));
            }
            selectQuery.addLimit(conditions.getPage(), conditions.getSize());
            log.info("YwMchChannelRepository.findByConditions.sql:{}", selectQuery.getSQL());
            return selectQuery;
        });
        resultFuture.setHandler(ar -> HandlerRespComposer.RESULTS_HANDLER.accept(future, ar));
        return this;
    }

    @Override
    public YwMchChannelRepository save(ChannelCreationReq channelCreationReq, Handler<AsyncResult<Integer>> handler) {
        log.info("YwMchChannelRepository.save channelCreationReq:{}", channelCreationReq);
        YwMchChannel ywMchChannel = channelCreationReq.toJson().mapTo(YwMchChannel.class);
        ywMchChannelDao.insert(ywMchChannel).setHandler(handler);
        return this;
    }

    @Override
    public YwMchChannelRepository update(ChannelUpdateReq channelUpdateReq, Handler<AsyncResult<Integer>> handler) {
        log.info("YwMchChannelRepository.update ChannelUpdateReq:{}", channelUpdateReq);
        YwMchChannel ywMchChannel = channelUpdateReq.toJson().mapTo(YwMchChannel.class);
        ywMchChannelDao.update(ywMchChannel).setHandler(handler);
        return this;
    }

    @Override
    public YwMchChannelRepository delete(String channelId, String businessType, Handler<AsyncResult<Integer>> handler) {
        log.info("YwMchChannelRepository.delete channelId:{} ; businessType:{}", channelId, businessType);
        Future<Integer> future = queryExecutor.execute(dslContext -> dslContext.deleteFrom(Tables.YW_MCH_CHANNEL)
                .where(YW_MCH_CHANNEL.CHANNEL_ID.eq(channelId))
                .and(YW_MCH_CHANNEL.BUSINESS_TYPE.eq(businessType)));
        future.setHandler(handler);
        return this;
    }

    @Override
    public YwMchChannelRepository findAllChannelIdAndNames(Handler<AsyncResult<JsonArray>> future) {
        log.info("YwMchChannelRepository.findAllChannelIdAndNames start");
        Future<List<JsonObject>> resultFuture = queryExecutor.findManyJson(dslContext -> dslContext.select(YW_MCH_CHANNEL.CHANNEL_ID, YW_MCH_CHANNEL.CHANNEL_NAME)
                .from(Tables.YW_MCH_CHANNEL));
        resultFuture.setHandler(ar -> HandlerRespComposer.RESULTS_HANDLER.accept(future, ar));
        return this;
    }
}

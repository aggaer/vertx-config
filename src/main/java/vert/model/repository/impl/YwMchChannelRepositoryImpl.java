package vert.model.repository.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import lombok.extern.slf4j.Slf4j;
import org.jooq.SelectQuery;
import vert.model.generated.tables.records.YwMchChannelRecord;
import vert.model.pojo.request.SmsChannelsFetchReq;
import vert.model.repository.BaseRepository;
import vert.model.repository.YwMchChannelRepository;

import java.util.List;
import java.util.Objects;

import static vert.model.generated.Tables.YW_MCH_CHANNEL;

/**
 * @author Jerry
 * @since 2019/4/28 11:41
 **/
@Slf4j
@SuppressWarnings("unused")
public class YwMchChannelRepositoryImpl extends BaseRepository implements YwMchChannelRepository {

    public YwMchChannelRepositoryImpl(AsyncSQLClient asyncSQLClient) {
        super(asyncSQLClient);
    }

    @Override
    public YwMchChannelRepository findByConditions(SmsChannelsFetchReq conditions, Handler<AsyncResult<JsonArray>> future) {
        Future<List<JsonObject>> resultFuture = queryExecutor.findManyJson(dslContext -> {
            SelectQuery<YwMchChannelRecord> selectQuery = dslContext.selectQuery(YW_MCH_CHANNEL);
            if (Objects.nonNull(conditions.getChannelId())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.CHANNEL_ID.eq(conditions.getChannelId()));
            }
            if (Objects.nonNull(conditions.getBusinessType())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.BUSINESS_TYPE.eq(conditions.getBusinessType()));
            }
            if (Objects.nonNull(conditions.getChannelName())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.BUSINESS_TYPE.likeIgnoreCase("%" + conditions.getChannelName() + "%"));
            }
            if (Objects.nonNull(conditions.getServiceType())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.SERVICE_TYPE.eq(conditions.getServiceType()));
            }
            if (Objects.nonNull(conditions.getPriority())) {
                selectQuery.addConditions(YW_MCH_CHANNEL.PRIORITY.eq(conditions.getPriority()));
            }
            log.info("YwMchChannelRepository.findByConditions.sql:{}", selectQuery.getSQL());
            return selectQuery;
        });
        resultFuture.setHandler(ar -> future.handle(ar.succeeded() ?
                Future.succeededFuture(new JsonArray(ar.result())) : Future.failedFuture(ar.cause())));
        return this;
    }
}

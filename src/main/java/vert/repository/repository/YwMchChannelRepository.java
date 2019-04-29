package vert.repository.repository;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import vert.model.pojo.request.sms.ChannelCreationReq;
import vert.model.pojo.request.sms.ChannelUpdateReq;
import vert.model.pojo.request.sms.SmsChannelsFetchReq;
import vert.repository.repository.impl.YwMchChannelRepositoryImpl;

/**
 * @author Jerry
 * @since 2019/4/28 11:38
 **/
@VertxGen
@ProxyGen
@SuppressWarnings("UnusedReturnValue")
public interface YwMchChannelRepository {

    /**
     * 多条件查询商户渠道表
     *
     * @param conditions 查询条件对象
     * @param handler    异步接收查询结果
     * @return 查询实体
     */
    @Fluent
    YwMchChannelRepository findByConditions(SmsChannelsFetchReq conditions, Handler<AsyncResult<JsonArray>> handler);

    /**
     * 保存商户渠道信息
     *
     * @param channelCreationReq 待保存商户渠道信息表
     * @param handler            异步接收查询结果
     * @return 查询实体
     */
    @Fluent
    YwMchChannelRepository save(ChannelCreationReq channelCreationReq, Handler<AsyncResult<Integer>> handler);

    @Fluent
    YwMchChannelRepository update(ChannelUpdateReq channelUpdateReq, Handler<AsyncResult<Integer>> handler);

    @Fluent
    YwMchChannelRepository delete(String channelId, String businessType, Handler<AsyncResult<Integer>> handler);

    @Fluent
    YwMchChannelRepository findAllChannelIdAndNames(Handler<AsyncResult<JsonArray>> handler);

    static YwMchChannelRepository create(AsyncSQLClient asyncSQLClient) {
        return new YwMchChannelRepositoryImpl(asyncSQLClient);
    }

    static YwMchChannelRepository createProxy(Vertx vertx, String address, DeliveryOptions options) {
        return new YwMchChannelRepositoryVertxEBProxy(vertx, address, options);
    }
}

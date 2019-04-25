package vert.model.repository.impl;

import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicGenericQueryExecutor;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Configuration;
import vert.enums.ExceptionEnums;
import vert.exception.BusinessException;
import vert.model.generated.Tables;
import vert.model.repository.TransSendDetailRepository;
import vert.utils.JooqConfigUtils;

import java.util.Objects;

import static vert.model.generated.tables.TransSendDetail.TRANS_SEND_DETAIL;

/**
 * @author Jerry
 * @since 2019/4/22 18:39
 **/
@Slf4j
public class TransSendDetailRepositoryImpl implements TransSendDetailRepository {
    private AsyncClassicGenericQueryExecutor queryExecutor;

    public TransSendDetailRepositoryImpl(AsyncSQLClient asyncSQLClient) {
        Configuration defaultConfig = JooqConfigUtils.getDefaultConfig();
        queryExecutor = new AsyncClassicGenericQueryExecutor(defaultConfig, asyncSQLClient);
    }

    @Override
    public TransSendDetailRepository findByPrimaryKey(String transId, String phone, Handler<AsyncResult<JsonObject>> future) {
        Future<JsonObject> resultFuture = queryExecutor.findOneJson(dslContext -> dslContext.selectFrom(Tables.TRANS_SEND_DETAIL)
                .where(TRANS_SEND_DETAIL.TRANS_ID.eq(transId))
                .and(TRANS_SEND_DETAIL.PHONE.eq(phone)));
        resultFuture.setHandler(ar -> {
            if (ar.succeeded()) {
                JsonObject result = ar.result();
                future.handle(Objects.nonNull(result) ? Future.succeededFuture(result) :
                        Future.failedFuture(new BusinessException(ExceptionEnums.QUERY_RESULT_NOT_EXIST)));
            } else {
                future.handle(Future.failedFuture(ar.cause()));
            }
        });
        return this;
    }
}

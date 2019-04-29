package vert.repository.repository.impl;

import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicGenericQueryExecutor;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import org.jooq.Configuration;
import vert.enums.SmsTemplateStatusEnum;
import vert.model.generated.Tables;
import vert.repository.repository.SmsTemplateRepository;
import vert.utils.JooqConfigUtils;

import static vert.model.generated.tables.SmsTemplate.SMS_TEMPLATE;

/**
 * @author Jerry
 * @since 2019/4/22 18:18
 **/
public class SmsTemplateRepositoryImpl implements SmsTemplateRepository {
    private AsyncClassicGenericQueryExecutor queryExecutor;

    public SmsTemplateRepositoryImpl(AsyncSQLClient asyncSQLClient) {
        Configuration defaultConfig = JooqConfigUtils.getDefaultConfig();
        queryExecutor = new AsyncClassicGenericQueryExecutor(defaultConfig, asyncSQLClient);
    }

    @Override
    public SmsTemplateRepository findByTempCode(String tempCode, Handler<AsyncResult<JsonObject>> handler) {
        Future<JsonObject> resultFuture = queryExecutor.findOneJson(dslContext ->
                dslContext.selectFrom(Tables.SMS_TEMPLATE)
                        .where(SMS_TEMPLATE.TEMP_CODE.eq(tempCode))
                        .and(SMS_TEMPLATE.TEMP_STATUS.notEqual(SmsTemplateStatusEnum.DELETED.getCode())));
        handler.handle(resultFuture);
        return this;
    }
}

package vert.repository.repository;

import io.github.jklingsporn.vertx.jooq.classic.async.AsyncClassicGenericQueryExecutor;
import io.vertx.ext.asyncsql.AsyncSQLClient;
import org.jooq.Configuration;
import vert.utils.JooqConfigUtils;

/**
 * @author Jerry
 * @since 2019/4/28 11:47
 **/
public abstract class BaseRepository {
    protected AsyncClassicGenericQueryExecutor queryExecutor;

    public BaseRepository(AsyncSQLClient asyncSQLClient) {
        Configuration defaultConfig = JooqConfigUtils.getDefaultConfig();
        queryExecutor = new AsyncClassicGenericQueryExecutor(defaultConfig, asyncSQLClient);
    }
}

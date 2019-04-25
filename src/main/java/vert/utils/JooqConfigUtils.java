package vert.utils;

import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.jooq.impl.DefaultConfiguration;

/**
 * @author Jerry
 * @since 2019/4/22 19:37
 **/
public class JooqConfigUtils {
    private static Configuration configuration;

    static {
        Settings settings = new Settings()
                .withRenderNameStyle(RenderNameStyle.AS_IS);
        configuration = new DefaultConfiguration()
                .set(SQLDialect.MYSQL)
                .set(settings);

    }

    public static Configuration getDefaultConfig() {
        return configuration;
    }
}

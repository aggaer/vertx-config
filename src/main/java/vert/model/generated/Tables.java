/*
 * This file is generated by jOOQ.
 */
package vert.model.generated;


import javax.annotation.Generated;

import vert.model.generated.tables.SmsTemplate;
import vert.model.generated.tables.TransSend;
import vert.model.generated.tables.TransSendDetail;
import vert.model.generated.tables.YwMchChannel;
import vert.model.generated.tables.YwMchChannelRouter;


/**
 * Convenience access to all tables in sms
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 短信模板
     */
    public static final SmsTemplate SMS_TEMPLATE = vert.model.generated.tables.SmsTemplate.SMS_TEMPLATE;

    /**
     * The table <code>sms.trans_send</code>.
     */
    public static final TransSend TRANS_SEND = vert.model.generated.tables.TransSend.TRANS_SEND;

    /**
     * The table <code>sms.trans_send_detail</code>.
     */
    public static final TransSendDetail TRANS_SEND_DETAIL = vert.model.generated.tables.TransSendDetail.TRANS_SEND_DETAIL;

    /**
     * The table <code>sms.yw_mch_channel</code>.
     */
    public static final YwMchChannel YW_MCH_CHANNEL = vert.model.generated.tables.YwMchChannel.YW_MCH_CHANNEL;

    /**
     * The table <code>sms.yw_mch_channel_router</code>.
     */
    public static final YwMchChannelRouter YW_MCH_CHANNEL_ROUTER = vert.model.generated.tables.YwMchChannelRouter.YW_MCH_CHANNEL_ROUTER;
}

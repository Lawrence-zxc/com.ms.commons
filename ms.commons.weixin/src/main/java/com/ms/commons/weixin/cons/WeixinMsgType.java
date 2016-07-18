package com.ms.commons.weixin.cons;

import org.apache.commons.lang.StringUtils;

/**
 * 接收微信的消息类型
 */
public enum WeixinMsgType {
    /**
     * 文本消息
     */
    text, voice, event, location;

    public boolean isText() {
        return this == text;
    }

    public boolean isVoice() {
        return this == voice;
    }

    public boolean isEvent() {
        return this == event;
    }

    public static WeixinMsgType getMsgType(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (WeixinMsgType type : values()) {
            if (type.name().equals(value)) {
                return type;
            }
        }
        return null;
    }
}

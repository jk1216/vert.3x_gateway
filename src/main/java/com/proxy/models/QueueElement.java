package com.proxy.models;

import io.netty.channel.Channel;


public class QueueElement {
    private final GatewayMessage message;
    private final Channel inboundChannel;

    public QueueElement(GatewayMessage message, Channel channel){
        inboundChannel = channel;
        this.message = message;
    }

    public GatewayMessage getMessage() {
        return message;
    }

    public Channel getInboundChannel() {
        return inboundChannel;
    }
}

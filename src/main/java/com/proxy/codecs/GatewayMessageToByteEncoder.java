package com.proxy.codecs;

import com.proxy.models.GatewayMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class GatewayMessageToByteEncoder extends MessageToByteEncoder<GatewayMessage> {
    @Override
    protected void encode(ChannelHandlerContext ctx, GatewayMessage msg, ByteBuf out) throws Exception {
        out.writeBytes(msg.getByteArray());
    }
}

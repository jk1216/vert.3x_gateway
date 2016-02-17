package com.proxy.gateway;

import com.proxy.codecs.ByteToGatewayMessageDecoder;
import com.proxy.codecs.GatewayMessageToByteEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;


public class BackEndHandlerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new GatewayMessageToByteEncoder());
        pipeline.addLast(new ByteToGatewayMessageDecoder());
        pipeline.addLast("bh", new BackendHandler());
    }
}

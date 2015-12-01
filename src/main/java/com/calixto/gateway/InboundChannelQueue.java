package com.calixto.gateway;

import com.calixto.models.QueueElement;
import io.netty.channel.Channel;

import java.util.concurrent.ConcurrentLinkedDeque;


public class InboundChannelQueue {
    private static ConcurrentLinkedDeque<QueueElement> bus = new ConcurrentLinkedDeque<QueueElement>();

    //ommit the use of construct
    private InboundChannelQueue(){

    }

    public static ConcurrentLinkedDeque<QueueElement> getInstance(){
        return bus;
    }
}

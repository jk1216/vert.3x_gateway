package com.proxy.gateway;

import com.proxy.models.QueueElement;

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

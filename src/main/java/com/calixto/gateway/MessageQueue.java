package com.calixto.gateway;

import com.calixto.models.QueueElement;

import java.util.concurrent.ConcurrentLinkedDeque;


public class MessageQueue {
    private static ConcurrentLinkedDeque<QueueElement> bus = new ConcurrentLinkedDeque<QueueElement>();

    //omitting calling the constructor
    private MessageQueue(){

    }

    public static ConcurrentLinkedDeque<QueueElement> getInstance(){
        return bus;
    }
}

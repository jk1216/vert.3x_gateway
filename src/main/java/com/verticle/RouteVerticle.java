package com.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.net.NetSocket;

/**
 * RouteVerticle
 *
 * @author Young
 * @date 2016/2/18 0018
 */
public class RouteVerticle extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.createNetClient().connect(1234, "localhost", res -> {

            if (res.succeeded()) {
                NetSocket socket = res.result();
                socket.handler(buffer -> {
                    System.out.println("Net client receiving: " + buffer.toString("UTF-8"));
                });

                // Now send some data
                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String str = "hello " + i + "\n";
                    System.out.println("Net client sending: " + str);
                    socket.write(str);
                }
            } else {
                System.out.println("Failed to connect " + res.cause());
            }
        });
    }
}

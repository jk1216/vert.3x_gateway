package com.proxy.conf;

import org.springframework.context.annotation.Configuration;


@Configuration
public class BackEnd {
    private int port;
    private String address;

    public BackEnd(String address, int port){
        this.address = address;
        this.port = port;
    }

    public BackEnd() {
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

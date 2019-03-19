package com.provider.service;

import com.api.service.DemoApi;

public class DemoApiImpl implements DemoApi {
    @Override
    public String sayHello() {
        return "Hello World!";
    }
}


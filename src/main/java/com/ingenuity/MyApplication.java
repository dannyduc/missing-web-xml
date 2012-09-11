package com.ingenuity;

import com.sun.jersey.api.core.PackagesResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class MyApplication extends PackagesResourceConfig {

    public MyApplication() {
        super("com.ingenuity");
    }
}

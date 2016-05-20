package com.manywho.services.slack;

import com.manywho.sdk.services.BaseApplication;

public class Application extends BaseApplication {
    public static void main(String[] args) throws Exception {
        Application application = new Application();
        application.startServer("api/slack/2");
    }
}

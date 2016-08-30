package com.manywho.services.slack;

import com.manywho.sdk.services.ServiceApplication;

public class Application extends ServiceApplication {
    public static void main(String[] args) throws Exception {
        Application application = new Application();
        application.setModule(new ApplicationModule());
        application.startServer("/api/slack/2");
    }
}

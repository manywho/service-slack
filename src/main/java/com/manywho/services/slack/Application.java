package com.manywho.services.slack;

import allbegray.slack.SlackClientFactory;
import allbegray.slack.webapi.SlackWebApiClient;
import allbegray.slack.type.*;
import com.manywho.sdk.services.BaseApplication;

import java.util.List;

public class Application extends BaseApplication {
    public static void main(String[] args) throws Exception {
//        Application application = new Application();
//        application.startServer();

        SlackWebApiClient webApiClient = SlackClientFactory.createWebApiClient("");

        webApiClient.addReminder("test", 100);

        ReminderList reminderList = webApiClient.getReminderList();

        System.out.println(reminderList);

    }
}

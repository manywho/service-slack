package com.manywho.services.slack;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.configuration.Configuration;

public class ApplicationConfiguration implements Configuration {
    @Configuration.Setting(name = "API Token", contentType = ContentType.Password, required = false)
    private String apiToken;

    public String getApiToken() {
        return apiToken;
    }
}

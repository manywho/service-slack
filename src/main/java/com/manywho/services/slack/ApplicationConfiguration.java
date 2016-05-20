package com.manywho.services.slack;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.configuration.ConfigurationValue;

public class ApplicationConfiguration {
    @ConfigurationValue(name = "API Token", contentType = ContentType.Password, required = false)
    private String apiToken;

    public String getApiToken() {
        return apiToken;
    }
}

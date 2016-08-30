package com.manywho.services.slack;

import com.github.scribejava.core.oauth.OAuth20Service;
import com.google.inject.AbstractModule;
import com.manywho.sdk.services.identity.AbstractOauth2;
import com.manywho.sdk.services.identity.providers.ScribeOauth2Provider;
import com.manywho.services.slack.identity.Slack;

public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AbstractOauth2.class).to(Slack.class);
        bind(OAuth20Service.class).toProvider(ScribeOauth2Provider.class);
    }
}

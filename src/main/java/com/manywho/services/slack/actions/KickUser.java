package com.manywho.services.slack.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.slack.types.Channel;
import com.manywho.services.slack.types.User;

@Action.Metadata(name = "Kick User from Channel", summary = "Kick User from Channel", uri = "kickuser")
public class KickUser {

    public static class Input {
        @Action.Input(name="Channel", contentType = ContentType.Object)
        private Channel channel;

        @Action.Input(name = "User", contentType = ContentType.Object)
        private User user;

        public Channel getChannel() {
            return channel;
        }

        public User getUser() {
            return user;
        }
    }

}

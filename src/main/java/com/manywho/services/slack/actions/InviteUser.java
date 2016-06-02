package com.manywho.services.slack.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.slack.types.Channel;
import com.manywho.services.slack.types.User;

@Action.Metadata(name = "Invite User to Channel", summary = "Invite User to Channel", uri = "inviteuser")
public class InviteUser {

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

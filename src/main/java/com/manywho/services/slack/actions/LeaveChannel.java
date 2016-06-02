package com.manywho.services.slack.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.slack.types.Channel;

@Action.Metadata(name = "Leave a Channel", summary = "Leave a Channel", uri = "leavechannel")
public class LeaveChannel {

    public static class Input {
        @Action.Input(name="Channel", contentType = ContentType.Object)
        private Channel channel;

        public Channel getChannel() {
            return channel;
        }
    }

}

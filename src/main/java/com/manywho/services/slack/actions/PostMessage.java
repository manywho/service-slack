package com.manywho.services.slack.actions;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.actions.Action;
import com.manywho.services.slack.types.Channel;
import com.manywho.services.slack.types.Message;

@Action.Metadata(name = "Post a message to channel", summary = "Post a message to channel", uri = "postmessage")
public class PostMessage {

    public static class Input {
        @Action.Input(name="Channel", contentType = ContentType.Object)
        private Channel channel;

        @Action.Input(name = "Message", contentType = ContentType.Object)
        private Message message;

        public Channel getChannel() {
            return channel;
        }

        public Message getUser() { return message; }
    }

}

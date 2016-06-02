package com.manywho.services.slack.types;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;

import java.util.Date;

@Type.Element(name = Reminder.NAME)
public class Reminder {
    public static final String NAME = "Reminder";

    @Type.Identifier
    private String id;

    @Type.Property(name = "Creator", contentType = ContentType.String)
    private String creator;

    @Type.Property(name = "Text", contentType = ContentType.String)
    private String text;

    @Type.Property(name = "Time", contentType = ContentType.DateTime)
    private Date time;

    @Type.Property(name = "Is Recurring", contentType = ContentType.Boolean)
    private boolean isRecurring;


    public String getCreator() {
        return creator;
    }

    public String getText() {
        return text;
    }

    public Date getTime() { return time; }

    public boolean getIsRecurring() { return isRecurring; }
}

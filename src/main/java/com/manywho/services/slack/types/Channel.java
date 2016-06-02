package com.manywho.services.slack.types;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;

import java.util.ArrayList;
import java.util.Date;

@Type.Element(name = Channel.NAME)
public class Channel {
    public static final String NAME = "Channel";

    @Type.Identifier
    private String id;

    @Type.Property(name = "Name", contentType = ContentType.String)
    private String name;

    @Type.Property(name = "Created Date", contentType = ContentType.DateTime)
    private Date dateCreated;

    @Type.Property(name = "Creator", contentType = ContentType.String)
    private String creator;

    @Type.Property(name = "Members", contentType = ContentType.List)
    private ArrayList<String> members;

    @Type.Property(name = "Topic", contentType = ContentType.String)
    private String topic;

    @Type.Property(name = "Purpose", contentType = ContentType.String)
    private String purpose;

    @Type.Property(name = "Is Archived", contentType = ContentType.Boolean)
    private boolean isArchived;

    @Type.Property(name = "Is General", contentType = ContentType.Boolean)
    private boolean isGeneral;

    @Type.Property(name = "Is Private", contentType = ContentType.Boolean)
    private boolean isPrivate;


    public String getName() {
        return name;
    }

    public Date getDateCreated() { return dateCreated; }

    public String getCreator() { return creator; }

    public ArrayList<String> getMembers() { return members; }

    public String getMember(String member) { return members.get(members.indexOf(member)); }

    public String getTopic() { return topic; }

    public String getPurpose() { return purpose; }

    public boolean getIsArchived() { return isArchived; }

    public boolean getIsGeneral() { return isGeneral; }

    public boolean getIsPrivate() { return isPrivate; }
}

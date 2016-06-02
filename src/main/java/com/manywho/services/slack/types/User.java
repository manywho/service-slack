package com.manywho.services.slack.types;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.types.Type;

@Type.Element(name = User.NAME)
public class User {
    public static final String NAME = "User";

    @Type.Identifier
    private String id;

    @Type.Property(name = "Name", contentType = ContentType.String)
    private String name;


    public String getName() {
        return name;
    }
}

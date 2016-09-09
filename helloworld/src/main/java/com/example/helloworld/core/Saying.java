package com.example.helloworld.core;

public class Saying {
    private final long id;
    private final String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
       
    //	java.util.TimeZone tz = java.util.TimeZone.getTimeZone("GMT+1");
    	return content;
    }
}

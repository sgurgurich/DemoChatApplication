package com.example.demo.Chat;

public class Chat {
    
    private final String name;
    private final String content;
    private final String timestamp;

    public Chat(String name, String content, String timestamp) {
        this.name = name;
        this.content = content;
        this.timestamp = timestamp;
    }
    
    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return this.name + " " + this.content + " " + this.timestamp;
    }

}

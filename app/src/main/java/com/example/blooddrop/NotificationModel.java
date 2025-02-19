package com.example.blooddrop;

public class NotificationModel {
    private final String type;
    private final String message;
    private final String timestamp;

    public NotificationModel(String type, String message, String timestamp) {
        this.type = type;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

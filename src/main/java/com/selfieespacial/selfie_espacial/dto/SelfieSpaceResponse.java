package com.selfieespacial.selfie_espacial.dto;

public class SelfieSpaceResponse {

    private String title;
    private String message;
    private String direction;
    private String time;

    public SelfieSpaceResponse(String title, String message, String direction, String time) {
        this.title = title;
        this.message = message;
        this.direction = direction;
        this.time = time;
    }

    public String getTitle(){
        return title;
    }

    public String getMessage(){
        return message;
    }

    public String getDirection() {
        return direction;
    }

    public String getTime() {
        return time;
    }
}
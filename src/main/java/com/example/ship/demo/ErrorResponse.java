package com.example.ship.demo;

import java.util.List;

public class ErrorResponse {
    private String message;
    private int status;
    private String currentCordinates;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCurrentCordinates() {
        return currentCordinates;
    }

    public void setCurrentCordinates(String currentCordinates) {
        this.currentCordinates = currentCordinates;
    }

    public ErrorResponse(String message, int status, String currentCordinates) {
        this.message = message;
        this.status = status;
        this.currentCordinates = currentCordinates;
    }
}

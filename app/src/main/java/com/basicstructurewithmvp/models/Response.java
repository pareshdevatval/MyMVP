package com.basicstructurewithmvp.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Paresh
 */
public class Response {

    @SerializedName("status")
    private
    boolean status;
    @SerializedName("message")
    private
    String message;
    @SerializedName("authentication")
    private
    boolean authentication;


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public void setAuthentication(boolean authentication) {
        this.authentication = authentication;
    }

}
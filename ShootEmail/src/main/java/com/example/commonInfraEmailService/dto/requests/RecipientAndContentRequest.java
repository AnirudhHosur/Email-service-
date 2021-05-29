package com.example.commonInfraEmailService.dto.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecipientAndContentRequest {


    @SerializedName("recipient")
    @Expose
    private String recipient;
    @SerializedName("content")
    @Expose
    private String content;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @SerializedName("topic")

    @Expose
    private String topic;



    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
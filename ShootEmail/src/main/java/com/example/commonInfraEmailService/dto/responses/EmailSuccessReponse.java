package com.example.commonInfraEmailService.dto.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class EmailSuccessReponse {


    @SerializedName("success")
    @Expose
    private Boolean success;

    @SerializedName("error")
    @Expose
    private String error;

    @SerializedName("error")
    @Expose
    private Map<String, Object> data;

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public EmailSuccessReponse() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public EmailSuccessReponse(Boolean success, String error, Map<String, Object> data) {
        this.success = success;
        this.error = error;
        this.data = data;
    }
}
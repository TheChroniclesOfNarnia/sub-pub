package com.micro.model;

import lombok.Data;

@Data
public class CommandResponse {
    private String error;
    private String id;
    private String payload;
}

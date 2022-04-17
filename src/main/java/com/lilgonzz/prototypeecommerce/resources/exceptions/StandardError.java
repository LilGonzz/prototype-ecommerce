package com.lilgonzz.prototypeecommerce.resources.exceptions;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StandardError {

    private Integer error;
    private String msg;
    private LocalDateTime timeStamp;

    public StandardError(Integer error, String msg, LocalDateTime timeStamp) {
        this.error = error;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }
}

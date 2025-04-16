package com.scb.payload.respone;

public class ResponseError extends  ResponseData<Object> {
    public ResponseError(int status, String message) {
        super(status, message);
    }
}

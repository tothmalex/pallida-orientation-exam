package com.greenfox.exam.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

public class ReturnMessage {
    HttpStatus result;
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    Iterable data;

    public ReturnMessage( HttpStatus result, Iterable data ) {
        this.result = result;
        this.data = data;
    }

    public ReturnMessage( HttpStatus result ) {
        this.result = result;
    }

    public ReturnMessage() {
    }

    public HttpStatus getResult() {
        return result;
    }

    public void setResult( HttpStatus result ) {
        this.result = result;
    }

    public Iterable getData() {
        return data;
    }

    public void setData( Iterable data ) {
        this.data = data;
    }
}

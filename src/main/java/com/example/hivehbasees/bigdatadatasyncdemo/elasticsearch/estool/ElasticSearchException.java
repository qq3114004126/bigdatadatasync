package com.example.hivehbasees.bigdatadatasyncdemo.elasticsearch.estool;

public class ElasticSearchException extends RuntimeException {
    private int status = 503;

    public ElasticSearchException(String message, int status) {
        super(message);
        this.status = status;
    }
}
package com.spring.smart_stay_hotel.exception;

public class PhotoRetrievalException extends RuntimeException {
    public PhotoRetrievalException(String errorRetrievingPhoto) {
        super(errorRetrievingPhoto);
    }
}

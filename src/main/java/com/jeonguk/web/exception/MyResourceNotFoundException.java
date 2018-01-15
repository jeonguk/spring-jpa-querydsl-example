package com.jeonguk.web.exception;

public final class MyResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6976626543549746028L;

    public MyResourceNotFoundException() {
        super();
    }

    public MyResourceNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public MyResourceNotFoundException(final String message) {
        super(message);
    }

    public MyResourceNotFoundException(final Throwable cause) {
        super(cause);
    }

}
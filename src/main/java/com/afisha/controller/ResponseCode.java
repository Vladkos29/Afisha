package com.afisha.controller;

public enum ResponseCode {

    SUCCESS(0),
    ERROR(1);

    private Integer code;

    ResponseCode(Integer code) {
        this.code = code;
    }

    /**
     * Получить код ответа
     *
     * @return код ответа
     */
    public Integer getCode() {
        return code;
    }
}

package com.afisha.controller;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class RestResponse {
    @JsonSerialize
    private class EmptyJsonResponse {
    }

    private ResponseCode responseCode;
    private String errorMessage;

    private Object response;

    /**
     * Конструктор ответа на запрос без ошибок
     */
    public RestResponse() {
        responseCode = ResponseCode.SUCCESS;
        this.response = new EmptyJsonResponse();
    }

    /**
     * Конструктор ответа на запрос без ошибок
     *
     * @param response данные ответа
     */
    public RestResponse(Object response) {
        responseCode = ResponseCode.SUCCESS;
        this.response = response;
    }

    /**
     * Получить код ответа
     *
     * @return код ответа
     */
    public int getResponseCode() {
        return responseCode.getCode();
    }

    /**
     * Установить код ответа
     *
     * @param responseCode код ответа
     */
    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Получить сообщение об ошибке
     *
     * @return сообщение об ошибке
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Установить сообщение об ошибке
     *
     * @param errorMessage сообщение об ошибке
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Получить данные ответа
     *
     * @return данные ответа
     */
    public Object getResponse() {
        return response;
    }

    /**
     * Устиновить данные ответа
     *
     * @param response данные ответа
     */
    public void setResponse(Object response) {
        this.response = response;
    }
}

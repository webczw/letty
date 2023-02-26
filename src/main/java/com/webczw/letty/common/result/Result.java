package com.webczw.letty.common.result;

public class Result<T> {
    private T data;
    private int status;

    public Result<T> success(T t) {
        this.status = 0;
        this.data = t;
        return this;
    }

    public Result<T> failure(T t) {
        this.status = 1;
        this.data = t;
        return this;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

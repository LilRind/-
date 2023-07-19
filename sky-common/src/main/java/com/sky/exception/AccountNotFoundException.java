package com.sky.exception;

/**
 * 账号不存在异常
 */
// 账号不存在异常是 BaseException 的子类
public class AccountNotFoundException extends BaseException {

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }

}

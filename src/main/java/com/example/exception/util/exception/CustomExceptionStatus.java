package com.example.exception.util.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum CustomExceptionStatus {

    SEVER_ERROR(0000, "서버오류 관리자에게 문의하세요"),
    VALIDATE_INVALID(1000, "요청한값이 올바르지않습니다."),
    PRODUCT_INVALID(2000, "해당하는 제품이없습니다.");


    private final Integer errorCode;
    private final String message;
}

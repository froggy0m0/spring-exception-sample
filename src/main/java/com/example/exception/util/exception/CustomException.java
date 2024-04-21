package com.example.exception.util.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class CustomException extends RuntimeException {

    private CustomExceptionStatus status;
}

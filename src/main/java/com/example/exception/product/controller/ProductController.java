package com.example.exception.product.controller;

import com.example.exception.util.exception.CustomException;
import com.example.exception.util.exception.CustomExceptionStatus;
import com.example.exception.product.domain.Product;
import com.example.exception.product.domain.ProductRepository;
import com.example.exception.product.dto.ProductSave;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/product")
@RestController
public class ProductController {

    private final ProductRepository repository;


    /**
     * Product 정보의 유효성을 검사합니다.
     * 유효하지 않은 경우 CustomExceptionStatus.VALIDATE_INVALID 예외를 발생시킵니다.
     *
     * @param productSave 검증이 필요한 Product 정보
     * @return 검증 성공시 "validate" 문자열 반환
     */
    @PostMapping
    public Object validateEx(@Validated @RequestBody ProductSave productSave) {
        log.info("productSave={}", productSave);

        return "validate";
    }

    /**
     * Product ID로 Product 정보를 조회합니다.
     * 만약 Product를 찾을 수 없으면 CustomExceptionStatus.PRODUCT_INVALID 예외를 발생시킵니다.
     *
     * @param Id 조회할 Product의 ID
     * @return 조회된 Product 객체
     */
    @GetMapping
    public Product searchEx(@RequestParam(name = "Id") Long Id) {
        Product product =  repository.findById(Id)
                .orElseThrow(() -> new CustomException(CustomExceptionStatus.PRODUCT_INVALID));

        log.info("Product={}", product);

        return product;
    }
}

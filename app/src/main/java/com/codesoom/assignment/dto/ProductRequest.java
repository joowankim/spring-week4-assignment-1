package com.codesoom.assignment.dto;

import com.codesoom.assignment.domain.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductRequest {

    private String name;

    private String maker;

    private int price;

    private String imageUrl;

    /**
     * 상품 요청 Dto를 상품 엔터티로 변환하고, 상품 엔터티를 리턴합니다.
     */
    public Product toProduct() {
        return Product.builder()
                .name(name)
                .maker(maker)
                .price(price)
                .imageUrl(imageUrl)
                .build();
    }

}

package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter

public class CoffeePatchDto {
    private Long coffeeId;

    @NotNull
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣]+(\\s?[ㄱ-ㅎ가-힣]+)*$", message = "한글만 입력해주세요.")
    private String korName;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z]+(\\s?[a-zA-Z]+)*$", message = "영문만 입력해주세요.")
    private String engName;

    @Min(value = 100) @Max(value = 50000)
    private int price;


}

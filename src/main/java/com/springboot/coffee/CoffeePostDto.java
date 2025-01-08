package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

//유효성 검증 적용 2. engName

@Getter
@Setter
public class CoffeePostDto {
    //유효성 검증 : korName에 공백, 빈문자열 X,
//    @NotSpace
    @NotNull
    @Pattern(regexp = "^([ㄱ-ㅎ|가-힣]+)(\\s?[ㄱ-ㅎ|가-힣])+$", message = "한글만 입력 가능합니다.")
    private String korName;

    //유효성 검증 : engName에 공백, 빈문자열 X, 영문(대소문자)만 허용  워드 사이에 한칸의 공백만 포함
    @NotNull
    @Pattern(regexp = "^([a-zA-Z]+)(\\s?[a-zA-Z])+$", message="영문만 입력 가능합니다.")
    private String engName;


    //유효성 검증 : 100 이상 50000 이하의 숫자만 포함
//    @Pattern(regexp = "^50000|[1-4]{1}[0-9]{4}|[0-9]{3,4}$")
//    @NotSpace
    @Min(value = 100) @Max(value = 50000)
    private int price;
}

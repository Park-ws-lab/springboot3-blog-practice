package me.parkwoosik.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.parkwoosik.springbootdeveloper.domain.Article;

@NoArgsConstructor // 기본생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성차 추가
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}

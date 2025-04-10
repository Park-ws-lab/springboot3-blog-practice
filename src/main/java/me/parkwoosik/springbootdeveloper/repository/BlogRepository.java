package me.parkwoosik.springbootdeveloper.repository;

import me.parkwoosik.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

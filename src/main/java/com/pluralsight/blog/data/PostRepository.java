package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostRepository extends JpaRepository<Post, Long> {
    public List<Post> findByTitleContaining(String title);
}

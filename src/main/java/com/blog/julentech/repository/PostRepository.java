package com.blog.julentech.repository;

import com.blog.julentech.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    //
}

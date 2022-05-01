package com.nhnacademy.board.domain.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.board.domain.Post;
import com.nhnacademy.board.domain.PostRepository;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostRepositoryImplTest {
    PostRepository postRepository = new PostRepositoryImpl();
    Post post;

    @BeforeEach
    void setUp() {
        post = new PostImpl();
        post.setId(1L);
        post.setTitle("This is title");
        post.setContent("This is context");
        post.setWriteTime(LocalDateTime.now());

    }

    @Test
    void register() {
        assertThat(postRepository.getPosts().size()).isEqualTo(0);
        postRepository.register(post);
        assertThat(postRepository.getPosts().size()).isEqualTo(1);
    }

    @Test
    void remove() {
        postRepository.register(post);
        assertThat(postRepository.getPosts().size()).isEqualTo(1);
        postRepository.remove(post.getId());
        assertThat(postRepository.getPosts().size()).isEqualTo(0);
    }

}
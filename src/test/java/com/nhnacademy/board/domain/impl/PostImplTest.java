package com.nhnacademy.board.domain.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.board.domain.Post;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PostImplTest {
    Post post = new PostImpl();

    @BeforeEach
    void setUp() {
        post.setId(10L);
        post.setContent("Hi!");
        post.setWriteTime(LocalDateTime.now());
        post.setTitle("title");
        post.setWriterUserId("hyunjin");
    }

    @Test
    void getId() {
        assertThat(post.getId()).isEqualTo(10L);
    }

    @Test
    void getTitle() {
        assertThat(post.getTitle()).isEqualTo("title");
    }

    @Test
    void getContent() {
        assertThat(post.getContent()).isEqualTo("Hi!");
    }

    @Test
    void getWriterUserId() {
        assertThat(post.getWriterUserId()).isEqualTo("hyunjin");
    }

    @Test
    void getWriteTime() {
        assertThat(post.getWriteTime().equals(LocalDateTime.now())).isTrue();
    }

    @Test
    void getViewCount() {
        assertThat(post.getViewCount()).isEqualTo(0);
        post.increaseViewCount();
        assertThat(post.getViewCount()).isEqualTo(1);
    }
}
package com.nhnacademy.board.domain.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.nhnacademy.board.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserImplTest {
    User user = new UserImpl();

    @BeforeEach
    void setUp() {
        user.setName("hyunjin");
        user.setId("hyunjinId");
        user.setPassword("1234");
    }

    @Test
    @DisplayName("User의 id와 password가 제대로 setting되었나 확인하는 테스트")
    void userTest() {
        assertThat(user.getId().equals("hyunjinId")).isTrue();
        assertThat(user.getName().equals("hyunjin")).isTrue();
    }


}
package com.nhnacademy.board.domain.impl;


import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserRepositoryImplTest {
    UserRepository userRepository = new UserRepositoryImpl();

    @BeforeEach
    void setUp() {
        User user = new UserImpl();
        user.setId("hyunjinId");
        user.setName("hyunjin");
        user.setPassword("1234");

        userRepository.add(user.getId(), user);
    }

    @Test
    @DisplayName("repository에 제대로 user가 저장됐나 확인하는 test")
    void repositoryAddTest() {
        assertThat(userRepository.getUser("hyunjinId")).isNotNull();
    }

    @Test
    @DisplayName("remove가 제대로 동작하는지 확인하는 test")
    void repositoryRemoveTest() {
        assertThat(userRepository.getUser("hyunjinId")).isNotNull();
        userRepository.remove("hyunjinId");
        assertThat(userRepository.getUser("hyunjinId")).isNull();
    }

}
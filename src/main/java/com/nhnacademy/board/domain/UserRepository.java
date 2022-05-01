package com.nhnacademy.board.domain;

import java.util.List;
import java.util.Map;

public interface UserRepository {
    void add(String id, User user);
    void modify(String id, User user);
    void remove(String id);

    User getUser(String id);
    List<User> getUsers();
}

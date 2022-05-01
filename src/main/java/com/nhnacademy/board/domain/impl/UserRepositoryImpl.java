package com.nhnacademy.board.domain.impl;

import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {
    Map<String, User> users = new HashMap<>();

    @Override
    public void add(String id, User user) {
        users.put(id, user);
    }

    @Override
    public void modify(String id, User user) {

    }

    @Override
    public void remove(String id) {
        users.remove(id);
    }

    @Override
    public User getUser(String id) {
        return users.get(id);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }
}

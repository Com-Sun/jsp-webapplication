package com.nhnacademy.board.domain.impl;

import com.nhnacademy.board.domain.User;
import com.nhnacademy.board.domain.UserRepository;
import java.util.Objects;

public class UserImpl implements User {
    private String id;
    private String password;
    private String name;
    private String profileFileName;
    private boolean admin = false;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getProfileFileName() {
        return this.profileFileName;
    }

    @Override
    public void setProfileFileName(String profileFileName) {
        this.profileFileName = profileFileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserImpl user = (UserImpl) o;
        return Objects.equals(id, user.id) &&
            Objects.equals(password, user.password) &&
            Objects.equals(name, user.name) &&
            Objects.equals(profileFileName, user.profileFileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, name, profileFileName);
    }

    @Override
    public String toString() {
        return "UserImpl{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", profileFileName='" + profileFileName + '\'' +
            '}';
    }
}

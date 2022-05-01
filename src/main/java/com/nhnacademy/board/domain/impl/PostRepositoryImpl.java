package com.nhnacademy.board.domain.impl;

import com.nhnacademy.board.domain.Post;
import com.nhnacademy.board.domain.PostRepository;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {
    @Override
    public long register(Post post) {
        return 0;
    }

    @Override
    public void modify(Post post) {

    }

    @Override
    public Post remove(long id) {
        return null;
    }

    @Override
    public Post getPost(long id) {
        return null;
    }

    @Override
    public List<Post> getPosts() {
        return null;
    }
}

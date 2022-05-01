package com.nhnacademy.board.domain.impl;

import com.nhnacademy.board.domain.Post;
import com.nhnacademy.board.domain.PostRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostRepositoryImpl implements PostRepository {
    private final Map<Long, Post> posts = new HashMap<>();

    @Override
    public long register(Post post) {
        posts.put(post.getId(), post);
        return post.getId();
    }

    @Override
    public void modify(Post post) {

    }

    @Override
    public Post remove(long id) {
        posts.remove(id);
        return null;
    }

    @Override
    public Post getPost(long id) {
        return posts.get(id);
    }

    @Override
    public List<Post> getPosts() {
        return new ArrayList<>(posts.values());
    }
}

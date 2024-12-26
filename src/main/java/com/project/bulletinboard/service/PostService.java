package com.project.bulletinboard.service;

import com.project.bulletinboard.mapper.PostMapper;
import com.project.bulletinboard.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }

    public Post getPostById(Long postId) {
        postMapper.incrementViewCount(postId);
        return postMapper.getPostById(postId);
    }

    public void createPost(Post post) {
        postMapper.insertPost(post);
    }

    public boolean updatePost(Post post) {
        postMapper.updatePost(post);
        return true;
    }

    public boolean deletePost(Long postId, String password) {
        postMapper.deletePost(postId, password);
        return true;
    }

}

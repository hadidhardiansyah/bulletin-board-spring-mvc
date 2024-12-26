package com.project.bulletinboard.mapper;

import com.project.bulletinboard.model.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> getAllPosts();
    Post getPostById(Long postId);
    void insertPost(Post post);
    void updatePost(Post post);
    void deletePost(Long postId, String password);
    void incrementViewCount(Long postId);

}

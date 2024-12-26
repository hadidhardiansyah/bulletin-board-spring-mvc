package com.project.bulletinboard.model;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class Post {

    private Long postId;
    private String title;
    private String author;
    private String content;
    private String password;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int viewCount;

}

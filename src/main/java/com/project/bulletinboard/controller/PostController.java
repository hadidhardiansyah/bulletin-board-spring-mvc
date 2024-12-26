package com.project.bulletinboard.controller;

import com.project.bulletinboard.model.Post;
import com.project.bulletinboard.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "post-list";
    }

    @GetMapping("/{postId}")
    public String viewPost(@PathVariable Long postId, Model model) {
        Post post = postService.getPostById(postId);
        model.addAttribute("post", post);
        return "post-detail";
    }

    @GetMapping("/new")
    public String createPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post-create";
    }

    @PostMapping("/new")
    public String createPost(@ModelAttribute Post post) {
        postService.createPost(post);
        return "redirect:/posts";
    }

    @GetMapping("/edit/{postId}")
    public String editPostForm(@PathVariable Long postId, Model model) {
        Post post = postService.getPostById(postId);
        model.addAttribute("post", post);
        return "post-edit";
    }

    @PostMapping("/edit/{postId}")
    public String editPost(@PathVariable Long postId, @ModelAttribute Post post) {
        post.setPostId(postId);
        postService.updatePost(post);
        return "redirect:/posts/" + postId;
    }

    @PostMapping("/delete/{postId}")
    public String deletePost(@PathVariable Long postId, @RequestParam String password) {
        postService.deletePost(postId, password);
        return "redirect:/posts";
    }
}

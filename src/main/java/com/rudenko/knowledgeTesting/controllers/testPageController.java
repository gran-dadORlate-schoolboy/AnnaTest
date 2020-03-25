package com.rudenko.knowledgeTesting.controllers;

import com.rudenko.knowledgeTesting.models.Post;
import com.rudenko.knowledgeTesting.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testPageController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/test-page")
    public String testPage (Model model){
      Iterable<Post> posts = postRepository.findAll();
       model.addAttribute("posts", posts);
        return "test-page";
    }

    @GetMapping("/test-page/add")
    public String testPageAdd (Model model){

        return "test-add";
    }
    @PostMapping("/test-page/add")
    public String testPageAddPost (@RequestParam String title, @RequestParam String qestion, @RequestParam String answer,   Model model){
        Post post = new Post(title, qestion, answer);
        System.out.println(post.getAnswer() + post.getQestions() + post.getTitle());
        postRepository.save(post);
        return "redirect:/";
    }
}




















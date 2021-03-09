package com.livemarker.webBlog.controllers;

import com.livemarker.webBlog.models.Post;
import com.livemarker.webBlog.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blogMain")
    public String blogMain(Model model) {
        Iterable<Post> posts=postRepository.findAll();
        model.addAttribute("posts",posts);
        return "blogMain";
    }
    @GetMapping("/blogMain/blogAdd")
    public String blogAdd(Model model) {

        return "blogAdd";
    }
    @PostMapping ("/blogMain/blogAdd")
    public String blogPostAdd(@RequestParam String title,@RequestParam String announce,@RequestParam String fullText, Model model){
        Post post=new Post(title,announce,fullText);
        postRepository.save(post);
        return "redirect:/blogMain";
    }
}

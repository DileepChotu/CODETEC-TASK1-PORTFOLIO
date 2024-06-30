package com.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.task1.Entity.BlogPost;
import com.task1.Serives.BlogService;
import com.task1.dto.BlogPostdto;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    
	

    @GetMapping("/blogs")
    public String viewBlogs(Model model) {
        model.addAttribute("blogs", blogService.getAllBlogPosts());
        return "blog";
    }

    @PostMapping("/blogs")
    public String addBlog(@ModelAttribute BlogPostdto blogPost) {
        blogService.saveBlogPost(blogPost);
        return "redirect:/blogs";
    }
}
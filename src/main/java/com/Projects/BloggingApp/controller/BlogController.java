package com.Projects.BloggingApp.controller;

import com.Projects.BloggingApp.model.Blog;
import com.Projects.BloggingApp.service.BlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    BlogService service;
    @GetMapping("/blogs")
    public List<Blog> allArticles(){
        return service.allArticles();
    }
    @PostMapping("/blogs/edit")
    public void editArticles(@RequestBody Blog blog){
        service.editArticles(blog);
    }

    @GetMapping("/blogs/title/{title}")
    public Blog articlesByTitle(@PathVariable String title){
        return service.articlesByTitle(title);
    }
    @GetMapping("/blogs/date/{date}")
    public List<Blog> findByDate(@PathVariable int date){
        return service.findByDate(date);
    }
    @DeleteMapping("/blogs/delete/{title}")
    public void delete(@PathVariable String title){
        service.delete(title);
    }
}

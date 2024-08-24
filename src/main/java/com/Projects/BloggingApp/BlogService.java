package com.Projects.BloggingApp;

import com.Projects.BloggingApp.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    BlogRepo repo;
    public List<Blog> allArticles(){
        return repo.findAll();
    }

    public void editArticles(Blog blog) {
        repo.save(blog);
    }

    public Blog articlesByTitle(String title) {
        return repo.findById(title).orElse(new Blog());
    }

    public List<Blog> findByDate(int date){
        return repo.findByDate(date);
    }

    public void delete(String title) {
        repo.deleteById(title);
    }
}

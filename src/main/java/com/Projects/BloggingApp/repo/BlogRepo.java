package com.Projects.BloggingApp.repo;

import com.Projects.BloggingApp.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepo extends JpaRepository<Blog,String> {
    public List<Blog> findByDate(int date);
}

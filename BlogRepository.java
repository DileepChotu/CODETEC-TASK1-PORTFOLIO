package com.task1.Repostry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task1.Entity.BlogPost;
import com.task1.dto.BlogPostdto;

public interface BlogRepository extends JpaRepository<BlogPost, Long> {;}

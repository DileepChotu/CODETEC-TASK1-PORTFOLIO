package com.task1.Serives;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task1.Entity.BlogPost;
import com.task1.Repostry.BlogRepository;
import com.task1.dto.BlogPostdto;
//BlogService.java
@Service
public class BlogService {
 @Autowired
 private BlogRepository blogRepository;

 public List<BlogPost> getAllBlogPosts() {
     return blogRepository.findAll();
 }

 public void saveBlogPost(BlogPostdto blogPost) {
	 BlogPost obj = new BlogPost();
	 obj.setId(blogPost.getId());
	 obj.setContent(blogPost.getContent());
	 obj.setDate(blogPost.getDate());
	 obj.setTitle(blogPost.getTitle());
     blogRepository.save(obj);
 }
}

package com.livemarker.webBlog.repo;

import com.livemarker.webBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}

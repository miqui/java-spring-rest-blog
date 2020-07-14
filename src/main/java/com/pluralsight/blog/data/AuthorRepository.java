package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
Assume we don’t want to allow browsing the authors at all, we only want authors to be displayed within a Post
        Add @RepositoryRestResource(exported = false) before the AuthorRepository interface declaration.
*/
@RepositoryRestResource(exported = false)
@Component
public interface AuthorRepository extends JpaRepository<Author, Long> {}
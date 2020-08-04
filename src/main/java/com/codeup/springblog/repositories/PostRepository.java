package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//Ad type of entity we want to crud, long is the reference type of primary key
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByTitle(String title);

//    Post findFirstByOrderByTitleAsc();

//   jpa query lang... JPQL
//    @Query("from Post a where a.id like ?1");
//    Post getPostById(Long id);

}

package com.rudenko.knowledgeTesting.repo;

import com.rudenko.knowledgeTesting.models.Post;
import org.springframework.data.repository.CrudRepository;
//создан интерфейс репозитория, который работает с сущностями  Post с базы данных
public interface PostRepository extends  CrudRepository<Post, Long> {

}

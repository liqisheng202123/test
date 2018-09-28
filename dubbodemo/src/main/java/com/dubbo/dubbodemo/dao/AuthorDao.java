package com.dubbo.dubbodemo.dao;

import com.dubbo.dubbodemo.entity.Author;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthorDao {
    int addAuthor(Author author);
    int updateAuthor(Author author);
    int deleteAuthor(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}

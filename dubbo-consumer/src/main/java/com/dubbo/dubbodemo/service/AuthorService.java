package com.dubbo.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Reference;


public interface AuthorService {

    String test(String name);
//    /**
//     * 新增
//     * */
//    int addAuthor(Author author);
//    /**
//     * 修改
//     * */
//    int updateAuthor(Author author);
//    /**
//     * 删除
//     * */
//    int deleteAuthor(Long id);
//    /**
//     * 单个查询
//     * */
//    Author findAuthor(Long id);
//    /**
//     * 所有查询
//     * */
//    List<Author> findAuthorList();
}

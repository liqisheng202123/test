package com.dubbo.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.dubbodemo.service.AuthorService;


//@ComponentScan(basePackages={"com.dubbo.dubbodemo.*"})
//@Transactional
@Service(version = "1.0.0")
public class AuthorServiceImpl implements AuthorService{
    @Override
    public String test(String name) {
        return "Helle   "+name+"!!!";
    }
//    @Autowired
//    private AuthorDao authorDao ;
//
//    @Override
//    public int addAuthor(Author author) {
//        return authorDao.addAuthor(author);
//    }
//
//    @Override
//    public int updateAuthor(Author author) {
//        return authorDao.updateAuthor(author);
//    }
//
//    @Override
//    public int deleteAuthor(Long id) {
//        return authorDao.deleteAuthor(id);
//    }
//
//    @Override
//    public Author findAuthor(Long id) {
//        return authorDao.findAuthor(id);
//    }
//
//    @Override
//    public List<Author> findAuthorList() {
//        return authorDao.findAuthorList();
//    }
}

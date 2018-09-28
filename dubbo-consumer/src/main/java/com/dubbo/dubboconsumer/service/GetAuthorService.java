package com.dubbo.dubboconsumer.service;


import com.dubbo.dubbodemo.entity.Author;
import com.dubbo.dubbodemo.service.AuthorService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class GetAuthorService {

    @Reference
    private AuthorService auhtorService;

    public String sayHello(String name){
        return auhtorService.test(name);
    }
//    public int addAuthor(Author author) {
//        return auhtorService.addAuthor(author);
//    }
//
//    public int updateAuthor(Author author) {
//        return auhtorService.updateAuthor(author);
//    }
//
//    public int deleteAuthor(Long id) {
//        return auhtorService.deleteAuthor(id);
//    }
//
//    public Author findAuthor(Long id) {
//        return auhtorService.findAuthor(id);
//    }
//
//    public List<Author> findAuthorList() {
//        return auhtorService.findAuthorList();
//    }


}

package com.dubbo.dubboconsumer.controller;

import com.dubbo.dubbodemo.entity.Author;
import com.dubbo.dubboconsumer.service.GetAuthorService;
import com.dubbo.dubbodemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/CURD", method = { RequestMethod.GET, RequestMethod.POST ,RequestMethod.PUT})
public class AuthorController {
    @Autowired
    private GetAuthorService getAuthorService ;
//    @Autowired
//    private TestService testService ;

    @RequestMapping("/sayasdf")
    public String sayHello(){
       return getAuthorService.sayHello("LQS");
    }
//    /**
//     * 查询用户列表
//     */
//    @RequestMapping(value = "/queryList",method = RequestMethod.GET)
//    public Map<String,Object> getAuthorList() {
//        List<Author> authorList = this.getAuthorService.findAuthorList();
//        Map<String,Object> param = new HashMap<String,Object>();
//        param.put("total", authorList.size());
//        param.put("rows", authorList);
//        return param;
//    }
//    /**
//     * 查询用户信息
//     */
//    @RequestMapping(value = "/query", method = RequestMethod.GET)
//    public Author getAuthor(Long userId) {
//        Author author = this.getAuthorService.findAuthor(userId);
//        if(author == null){
//            throw new RuntimeException("查询错误");
//        }
//        return author;
//    }
//
//    /**
//     * 新增方法
//     */
//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    public void addAuthor(Author author) {
//        try{
//            this.getAuthorService.addAuthor(author);
//        }catch(Exception e){
//            e.printStackTrace();
//            throw new RuntimeException("新增错误");
//        }
//    }
//    /**
//     * 更新方法
//     */
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public void updateAuthor(Author author) {
//        try{
//            this.getAuthorService.updateAuthor(author);
//        }catch(Exception e){
//            e.printStackTrace();
//            throw new RuntimeException("更新错误");
//        }
//    }
//    /**
//     * 删除方法
//     */
//    @RequestMapping(value = "/delete", method = RequestMethod.GET)
//    public void deleteAuthor( Long userId) {
//        try{
//            this.getAuthorService.deleteAuthor(userId);
//        }catch(Exception e){
//            throw new RuntimeException("删除错误");
//        }
//    }
}
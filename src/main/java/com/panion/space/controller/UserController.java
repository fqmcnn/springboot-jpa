package com.panion.space.controller;

import com.panion.space.entity.User;
import com.panion.space.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: springboot-jpa
 * @desciption: 用户控制层
 * @author: QiMing
 * @create: 2019-03-30 16:39
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    //使用jpa向表里添加数据
    @RequestMapping("/addUser")
    public ModelAndView addUser(){
        User u = new User("baby",25,"12345611.com");
        u.setId(2);
        userMapper.save(u);
        ModelAndView mv=new ModelAndView();
        mv.addObject("info","添加成功");
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/delUser")
    public ModelAndView addUser(int id){
        User u=new User();
        u.setId(id);
        userMapper.delete(u);
        ModelAndView mv=new ModelAndView();
        mv.addObject("info","添加成功");
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/selectUser")
    public ModelAndView selectUser(){

        System.out.println(  userMapper.findAll());
        ModelAndView mv=new ModelAndView();
        mv.addObject("info",userMapper.findAll().toString()+"添加成功");
        mv.setViewName("user");
        return mv;
    }
}

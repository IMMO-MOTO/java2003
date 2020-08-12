package cn.com.demo.springboot.demo.service;

import cn.com.demo.springboot.demo.entity.User;

import java.util.List;

public interface UserService {
     public boolean verify(String userName,String password);
     public void register(User user);
     public List<User> searchAll();
}

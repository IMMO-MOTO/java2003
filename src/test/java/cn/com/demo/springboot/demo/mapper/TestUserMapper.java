package cn.com.demo.springboot.demo.mapper;


import cn.com.demo.springboot.demo.SpringbootDemoApplication;
import cn.com.demo.springboot.demo.entity.User;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class TestUserMapper {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelectByPrimaryKey(){
        long id = 1;
        String userName = "张三";
        String userCode = "zhangsan";
        User user = userMapper.selectByPrimaryKey(id);
        String actUserName = user.getUsername();
        String actCode = user.getUsercode();
        Assert.assertEquals(userName,actUserName);
        Assert.assertEquals(userCode,actCode);
    }
}

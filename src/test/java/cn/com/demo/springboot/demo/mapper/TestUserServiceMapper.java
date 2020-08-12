package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.SpringbootDemoApplication;
import cn.com.demo.springboot.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class TestUserServiceMapper {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testVerify(){
        // 测试数据
        String userName = "z";
        String password = "z";

        // 期望
        boolean result = true;
        // 获取实际结果
        result = userService.verify(userName,password);
        // 断言
        Assert.assertTrue(result);
    }

}

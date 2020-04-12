package dong.controller;

import dong.config.MyConfigBean;
import dong.domain.Person;
import dong.domain.User;
import dong.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ConfigurationProperties(prefix = "person")
public class QuickStartController {
//    @Value("${person.name}")
//    private String name;
//    @Value("${person.age}")
//    private Integer age;


    private String name;
    private Integer age;
    private String addr;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }

    @RequestMapping("/quick")
    @ResponseBody
    public Person quick(){
        return new Person(name,age,addr);
    }

    @RequestMapping("/myconfig")
    @ResponseBody
    public String myconfig(){
        return "Hello, this is my config. name=" + myConfigBean.getName() + ", age =" + myConfigBean.getAge();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

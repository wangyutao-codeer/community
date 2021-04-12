package com.kaikeba.community.service;

import com.kaikeba.community.mapper.UserMapper;
import com.kaikeba.community.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public void add(User user) {
        userMapper.insert(user);
    }

    public User findByToken(String token) {
//        return userMapper.selectBYToken(token);

//        User user = userMapper.selectByPrimaryKey(token);
//        User user = userMapper.selectBYToken(token);
//        return user;
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("token",token);
        List<User> users = userMapper.selectByExample(example);
        System.out.println("uers="+users);
        return users.get(0);

    }
}

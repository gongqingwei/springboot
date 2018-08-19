package cn.no7player.service.impl;

import cn.no7player.mapper.UserMapper;
import cn.no7player.dao.User;
import cn.no7player.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        return user;
    }
}

package cn.huntbuy.blog.service;

import cn.huntbuy.blog.dao.UserDao;
import cn.huntbuy.blog.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    UserDao userDao;

    public User get(String username, String password) {
        return userDao.getByUsernameAndPassword(username,password);
    }
}

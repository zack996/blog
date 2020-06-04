package cn.huntbuy.blog.dao;

import cn.huntbuy.blog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user WHERE username=#{username} AND password=#{password}")
    User getByUsernameAndPassword(String username,String password);
}

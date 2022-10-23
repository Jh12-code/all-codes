package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select *from tb_user1 where username=#{username} and password=#{password}")
    User select(@Param("username")String username, @Param("password")String password);
}

package com.kaikeba.community.mapper;

import com.kaikeba.community.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {


//    @Select("select * from user where token=#{token}")
//    User selectBYToken(@Param("token") String token);
}

package com.wu.mapper;


import com.wu.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AdminMapper {

    Admin login(@Param("username") String username, @Param("password") String password);
}

package com.itheima.mapper;

import com.itheima.pojo.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/23 16:14
 */
public interface UserMapper {

    /**
     * 添加用户信息
     *
     * @return 影响的行数
     */
    int insertUser();

    /**
     * 修改用户信息
     *
     * @return 影响的行数
     */
    int updateUser();

    /**
     * 删除用户信息
     *
     * @return 影响的行数
     */
    int deleteUser();

    /**
     * 根据ID查询用户信息
     *
     * @return 指定ID的用户
     */
    User getUserById();

    /**
     * 查询所有用户的信息
     *
     * @return 所有用户的集合
     */
    List<User> getUser();


}

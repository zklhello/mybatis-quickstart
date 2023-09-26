package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ClassName: UserMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/23 22:58
 */
public interface UserMapper {

    /**
     * 获取所有用户的信息
     *
     * @return 所有用户的集合
     */
    List<User> getAllUsers();

    /**
     * 通过参入参数，查询指定的用户信息
     *
     * @param username 指定的用户名
     * @return 满条件的用户集合
     */
    List<User> getUserByUsername(String username);

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int insertOneUser(User user);

    /**
     * 验证登录
     *
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

}

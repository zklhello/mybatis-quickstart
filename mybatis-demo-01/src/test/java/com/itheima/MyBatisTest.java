package com.itheima;

import com.itheima.mapper.SelectMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ClassName: MyBatisTest
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/23 23:47
 */
public class MyBatisTest {

    @Test
    public void testSelectAllUserByMapKey() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.selectAllUserByMapKey();
        System.out.println(map);
    }

    @Test
    public void testSelectAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<String, Object>> maps = mapper.selectAllUser();
        System.out.println(maps);
    }

    @Test
    public void testSelectUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.selectUserByIdToMap(5);
        System.out.println(map);
    }

    @Test
    public void testSelectUserCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int res = mapper.selectUserCount();
        System.out.println("用户的总记录数为：" + res);
    }

    @Test
    public void testSelectUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.selectUserById(5);
        System.out.println(user);
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("tom", "tom");
        System.out.println(user);
    }

    @Test
    public void testInsertOneUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "jane", "jane", 12, "女", "zklhello@163.com");
        int res = mapper.insertOneUser(user);
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "tom");
        map.put("password", "tom");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("tom", "tom");
        System.out.println(user);
    }

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserByUsername("admin");
        userList.forEach(System.out::println);
    }

    @Test
    public void testGetAllUsers() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getAllUsers();
        userList.forEach(System.out::println);
    }
}

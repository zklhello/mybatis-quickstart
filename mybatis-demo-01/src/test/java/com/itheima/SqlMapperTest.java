package com.itheima;

import com.itheima.mapper.SqlMapper;
import com.itheima.pojo.User;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: SqlMapperTest
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/24 22:19
 */
public class SqlMapperTest {

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        User user = new User(null, "bob", "123456", 24, "男", "zklhello@163.com");
        int res = mapper.insertUser(user);
        System.out.println(user);
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testDeleteUserByIds() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        int res = mapper.deleteUsxerByIds("1,2,3");
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> userList = mapper.getUserByLike("j");
        System.out.println(userList);
    }

}

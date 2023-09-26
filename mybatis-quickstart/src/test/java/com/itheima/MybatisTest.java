package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: myabtisTest
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/23 16:50
 */
public class MybatisTest {

    @Test
    public void testGetUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 开启自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 测试
        List<User> userList = mapper.getUser();
        // 方法引用
        userList.forEach(System.out::println);
    }

    @Test
    public void testGetUserById() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 开启自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 测试
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testDelete() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 开启自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 测试
        int res = mapper.deleteUser();
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testUpdate() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 开启自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 测试
        int res = mapper.updateUser();
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testInsert() throws IOException {
        // 加载核心配资文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        // 获取...Builder
        SqlSessionFactoryBuilder sqlSFB = new SqlSessionFactoryBuilder();
        // 获取...Factory
        SqlSessionFactory sqlSF = sqlSFB.build(is);
        // 获取...Session
        // SqlSession sqlSession = sqlSF.openSession();
        // 开启自动提交
        SqlSession sqlSession = sqlSF.openSession(true);
        // 获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);// 代理模式
        // 测试
        int res = mapper.insertUser();
        System.out.println("影响了" + res + "行数据");

        // 提交事务
        // 开启自动提交，不需要手动提交
        // sqlSession.commit();
    }
}

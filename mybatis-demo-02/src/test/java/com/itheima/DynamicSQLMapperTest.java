package com.itheima;

import com.itheima.mapper.DynamicSQLMapper;
import com.itheima.pojo.Emp;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: DynamicSQLMapperTest
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/26 15:26
 */
public class DynamicSQLMapperTest {

    @Test
    public void testInsertByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(null, "b", 12, "男", "zklhello@163.com"));
        empList.add(new Emp(null, "b", 12, "男", "zklhello@163.com"));
        empList.add(new Emp(null, "b", 12, "男", "zklhello@163.com"));
        int res = mapper.insertByList(empList);
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testDeleteByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int res = mapper.deleteByArray(new Integer[]{6, 7, 8});
        System.out.println("影响了" + res + "行数据");
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 22, "男", null);
        List<Emp> empList = mapper.getEmpByChoose(emp);
        empList.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, null, 22, null, null);
        List<Emp> empList = mapper.getEmpByCondition(emp);
        empList.forEach(System.out::println);
    }

}

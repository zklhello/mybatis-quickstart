package com.itheima;

import com.itheima.mapper.DeptMapper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Emp;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: TestEmpMapper
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/25 17:21
 */
public class TestEmpMapper {

    @Test
    public void testSelectDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.selectDeptAndEmpByStep(2);
        System.out.println(dept.getDeptName());
        System.out.println("--------------------");
        System.out.println(dept.getEmps());
    }

    @Test
    public void testSelectDeptAndEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.selectDeptAndEmp(2);
        System.out.println(dept);
    }

    @Test
    public void testSelectEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectEmpAndDeptByStep(1);
        System.out.println(emp.getEmpName());
        System.out.println("---------------------------------");
        System.out.println(emp.getDept());
    }

    @Test
    public void testSelectEmpAndDept() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectEmpAndDept(1);
        System.out.println(emp);
    }

    @Test
    public void testSelectAllEmp() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empList = mapper.selectAllEmp();
        empList.forEach(System.out::println);
    }

}

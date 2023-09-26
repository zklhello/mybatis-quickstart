package com.itheima;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: PageHelperTest
 * Package: com.itheima
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/26 21:36
 */
public class PageHelperTest {

    /**
     * limit index, pageSize
     * index：当前页的起始索引，从0开始
     * pageSize：每页显示的条数

     * pageNum：当前页码
     * index = (pageNum - 1) * pageSize
     */
    @Test
    public void testPageHelper() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 开启分页
        Page<Object> page = PageHelper.startPage(2, 5);
        List<Emp> empList = mapper.selectAllEmp();
        // 获取分页相关信息
        PageInfo<Emp> pageInfo = new PageInfo<>(empList, 5);
        empList.forEach(System.out::println);
        System.out.println(pageInfo);
    }

}

package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: DynamicSQLMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/26 15:07
 */
public interface DynamicSQLMapper {

    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 测试choose、when、otherwise
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     */
    int deleteByArray(@Param("eids") Integer[] eids);

    /**
     * 通过List集合批量添加
     */
    int insertByList(@Param("emps") List<Emp> emps);
}

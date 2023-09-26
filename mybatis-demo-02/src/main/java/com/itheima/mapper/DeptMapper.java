package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: DeptMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/25 17:15
 */
public interface DeptMapper {
    /**
     * 通过分步查询获取员工以及所对应的部门信息
     * 第二步：根据第一步得出的部门信息did，在部门表中获取其对应的部门信息
     */
    Dept selectEmpAndDeptByStepSecond(@Param("did") Integer did);

    /**
     * 获取部门以及部门中所有员工的信息
     */
    Dept selectDeptAndEmp(@Param("did") Integer did);

    /**
     * 通过分布查询获取部门以及部门对应的员工信息
     * 第一步：根据did获取部门的信息
     */
    Dept selectDeptAndEmpByStep(@Param("did") Integer did);
}

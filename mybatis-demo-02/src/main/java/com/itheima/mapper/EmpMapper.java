package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: EmpMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/25 17:15
 */
public interface EmpMapper {

    /**
     * 获取所有员工的信息
     */
    List<Emp> selectAllEmp();

    /**
     * 查询员工以及对应的部门的信息
     */
    Emp selectEmpAndDept(@Param("eid") Integer eid);

    /**
     * 通过分步查询获取员工以及所对应的部门信息
     * 第一步：根据eid查询出员工，然后得到其部门信息did
     */
    Emp selectEmpAndDeptByStep(@Param("eid") Integer eid);

    /**
     * 通过分布查询获取部门以及部门对应的员工信息
     * 第二步：根据did查询对应的员工信息
     */
    List<Emp> selectDeptAndEmpByStepSecond(@Param("did") Integer did);

}

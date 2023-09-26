package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * ClassName: SelectMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/24 20:36
 */
public interface SelectMapper {

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User selectUserById(@Param("id") Integer id);

    /**
     * 查询用户信息的总记录数
     */
    Integer selectUserCount();

    /**
     * 根据ID查询用户信息，将结果集转换为Map集合
     * @param id
     * @return
     */
    Map<String, Object> selectUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<Map<String, Object>> selectAllUser();

    /**
     * 查询所有用户的信息
     * @return
     */
    @MapKey("id")
    Map<String, Object> selectAllUserByMapKey();
}

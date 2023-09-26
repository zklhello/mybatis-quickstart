package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: SqlMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author 周康来
 * @Create 2023/9/24 22:17
 */
public interface SqlMapper {

    /**
     * 根据用户名模糊查询用户信息
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * 批量删除
     */
    int deleteUsxerByIds(@Param("ids") String ids);

    /**
     * 获取自增的主键
     */
    int insertUser(User user);
}

package com.lagou.mapper;

import com.lagou.pojo.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: IRoleMapper
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：10/5/2023 下午3:35   @Version 1.0        描述
 */
public interface IRoleMapper {

    @Select("select * from sys_role r, sys_user_role ur where r.id = ur.roleid and ur.userid = #{uid}")
    public List<Role> findRoleByUid(Integer uid);
}

package com.lagou.dao;

import com.lagou.pojo.User;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: IUserDao
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：9/5/2023 下午5:44   @Version 1.0        描述
 */
public interface IUserDao {

    //查询所有用户
    public List<User> findAll() throws IOException;

    //多条件组合查询: 演示if
    public List<User> findByCondition(User user);

    //多值查询: 演示foreach
    public List<User> findByIds(int[] ids);
}

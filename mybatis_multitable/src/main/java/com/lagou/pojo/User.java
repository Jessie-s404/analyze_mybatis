package com.lagou.pojo;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

import static javafx.scene.input.KeyCode.G;

/**
 * ClassName: User
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：9/5/2023 下午6:52   @Version 1.0        描述
 */
@Table(name = "user")
public class User implements Serializable {

    @Id //对应的是注解id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //设置主键的生成策略
    private Integer id;

    private String username;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

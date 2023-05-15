package com.lagou.pojo;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
/*
* 存放数据库基本信息，Map<唯一标识, Mapper> 唯一标识：namespace+"."+id
* todo: 读取配置文件
* */
public class Configuration {

    //数据源
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * key:statementId value:封装好的mappedStatement对象
     */
    Map<String, MappedStatement> mappedStatementMap = new HashMap<>();

    public Map<String, MappedStatement> getMappedStatementMap() {return mappedStatementMap;}

    public void setMappedStatementMap(Map<String, MappedStatement> mappedStatementMap) {
        this.mappedStatementMap = mappedStatementMap;
    }
}

package com.lagou.sqlSession;

/**
 * 创建SqlSession
 */
public interface SqlSessionFactory {

    public SqlSession openSession();
}

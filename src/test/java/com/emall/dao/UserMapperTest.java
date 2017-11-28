package com.emall.dao;

import com.emall.common.ResultEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserMapperTest {
    //ApplicationContext act;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testDeleteByPrimaryKey() throws Exception {
        System.out.println(userMapper);
    }

    @Test
    public void testInsert() throws Exception {

    }

    @Test
    public void testInsertSelective() throws Exception {

    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    @Test
    public void testUpdateByPrimaryKey() throws Exception {
        ResultEnum resultEnum=ResultEnum.stateOf(1);
        System.out.println(resultEnum.getMsg());

    }
}
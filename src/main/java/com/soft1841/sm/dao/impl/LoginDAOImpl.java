package com.soft1841.sm.dao.impl;
/**
 * author By Ytker
 */

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.dao.LoginDAO;

import java.sql.SQLException;
import java.util.List;

public class LoginDAOImpl implements LoginDAO {
    /**
     * 查询用户名与密码
     * @param user
     * @param psd
     * @return
     * @throws SQLException
     */
    @Override
    public List<Entity> selectAdmin(String user, String psd) throws SQLException {
        return Db.use().query("SELECT * FROM t_user WHERE account = ? and password = ?",user,psd);
    }

    /**
     * 单行SQL语句，从数据库i查询用户输入的用户名
     * @param name
     * @return
     * @throws SQLException
     */
    @Override
    public Entity getUserByName(String name) throws SQLException {
        return Db.use().queryOne("select * from t_user where account = ?" ,name);
    }
}
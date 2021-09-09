package com.sowatec.database.dao.impl;

import com.sowatec.data.User;
import com.sowatec.database.SQLConstants;
import com.sowatec.database.dao.UserDao;

import java.util.List;

import static com.sowatec.database.SQLConstants.ALL;
import static com.sowatec.database.SQLConstants.FROM;
import static com.sowatec.database.SQLConstants.SELECT;
import static com.sowatec.database.SQLConstants.T_USER;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getAll() {
        try {
            String sql = SQLConstants.buildSQL(SELECT, ALL, FROM, T_USER);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(User value) {

    }

    @Override
    public void delete(User value) {

    }
}

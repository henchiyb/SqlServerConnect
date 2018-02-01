package com.niyanz.nhan.sqlserverdemo.jdbc;

import com.niyanz.nhan.sqlserverdemo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nhan on 1/30/2018.
 */

public class UserModel {
    private JDBCController jdbcController = new JDBCController();
    private Connection connection;

    public UserModel() {
        connection = jdbcController.ConnnectionData(); // Tạo kết nối tới database
    }

    public List<User> getAllUser() throws SQLException {
        ArrayList<User> list = new ArrayList<>();
        String sql = "SELECT * FROM users";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            int id = rs.getInt("UserID");
            String username = rs.getString("UserName");
            String password = rs.getString("Password");
            User user = new User(id, username, password);
            list.add(user);
        }
        return list;
    }

    public void insertIntoUsersTable(User user) throws SQLException {
        String sql = "INSERT INTO users(UserID, UserName, Password) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        statement.setString(2, user.getUserName());
        statement.setString(3, user.getPassword());
        statement.execute();
    }
}

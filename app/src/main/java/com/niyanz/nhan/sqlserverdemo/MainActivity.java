package com.niyanz.nhan.sqlserverdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.niyanz.nhan.sqlserverdemo.jdbc.UserModel;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User(3, "henchiyb", "1234");
        UserModel userModel = new UserModel();
        try {
            userModel.insertIntoUsersTable(user);
            Log.d("Test insert: ", "OK");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

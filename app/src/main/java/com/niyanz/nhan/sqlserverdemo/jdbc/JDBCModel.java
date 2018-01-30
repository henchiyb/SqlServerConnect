package com.niyanz.nhan.sqlserverdemo.jdbc;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Nhan on 1/30/2018.
 */

public class JDBCModel {

    public Connection getConnectionOf() {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection objConn = null;
        String sConnURL = null;
        JDBCObject objEntity = new JDBCObject("DESKTOP-LP0P2MA\\SQLEXPRESS", "henchiyb",
                "1234", "SqlServerDemo", "1433");
        try {
            Class.forName(objEntity.getsClass());
            sConnURL = "jdbc:jtds:sqlserver://"
                    + objEntity.getsServerName() + ":" + objEntity.getsPrort() + ";"
                    + "databaseName=" + objEntity.getsDatabase()
                    + ";user=" + objEntity.getsUserId()
                    + ";password=" + objEntity.getsPwd() + ";";
            objConn = DriverManager.getConnection(sConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return objConn;
    }
}

package com.niyanz.nhan.sqlserverdemo.jdbc;

import java.sql.Connection;

/**
 * Created by Nhan on 1/30/2018.
 */

public class JDBCController {
    JDBCModel JdbcModel = new JDBCModel();

    public Connection ConnnectionData() {
        return JdbcModel.getConnectionOf();
    }
}

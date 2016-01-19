package com.github.dataloader

import com.github.dataloader.rdbms.metadata.Schema

import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.DriverManager
import java.sql.ResultSet

/**
 * Created by pxie on 1/14/16.
 */
class Database {

    DBType type

    Schema[] schemas

    boolean connect() {

        String url='jdbc:postgresql://localhost/';
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","postgres");
        props.setProperty("ApplicationName","ttttest");

        Class.forName("org.postgresql.Driver")

        Connection conn = DriverManager.getConnection(url, props);

        conn.setClientInfo("ApplicationName","Test")

        DatabaseMetaData metadata = conn.getMetaData()
        ResultSet rs = metadata.catalogs;
        while(rs.next()) {
            println 'C : ' + rs.getString(1)
        }
    }


    public static void main(String[] args) {
        Database db = new Database();
        db.connect();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public abstract class AbstractDAO {
        public Connection connect() throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        com.mysql.jdbc.Driver s; - mysql connection package
//        com.microsoft.sqlserver.jdbc.SQLServerDriver - mssql connection package
        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "12345";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}

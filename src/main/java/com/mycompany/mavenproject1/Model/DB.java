/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class DB {
    public Connection con;
    public Statement stmt;
    
    DB() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/ornek?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");  
        stmt=con.createStatement();  
    }
    
    public void kapat() throws Exception{
        con.close();
    }
}

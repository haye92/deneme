/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Model;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */ 
public class abc extends DB{
    public int x;
    public String a,b;
    
    public ArrayList<abc> listele() throws Exception{
        ResultSet rs=stmt.executeQuery("select * from abc");  
        ArrayList<abc> elemanlar = new ArrayList<abc>();
        while(rs.next())  {
            abc t = new abc();
            t.x = rs.getInt(1);
            t.a = rs.getString(2);
            t.b = rs.getString(3);
            elemanlar.add(t);
        }
        kapat();
        return elemanlar;

    }
    
}

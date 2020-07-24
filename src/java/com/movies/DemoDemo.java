/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies;

/**
 *
 * @author rowdy
 */
public class DemoDemo {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println("Msg :"+DbConnection.getStatus("raaj"));
         System.out.println("Msg :"+DbConnection.updateStatus("raaj"));
           System.out.println("Msg :"+DbConnection.getStatus("raaj"));
         
         User user = DbConnection.getUser("raj@raj");
         
         System.out.println("name :" + user.getFirstname() +" "+user.getLastname());
         
        
        
        
    }
    
}

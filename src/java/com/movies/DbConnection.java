
package com.movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;


public class DbConnection {
    
    private static String Db_url =  "jdbc:mysql://localhost:3306/Movies";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static  String user = "raj";
    private static String pass = "raj";
    
    private static Connection getConnection()
    {
        try {
             Class.forName(driverName);
             return DriverManager.getConnection(Db_url,user,pass);
             
        } catch (Exception e) {
            System.out.println("Error msg : "+e.getMessage());
        }
        return null;
    }
    
    public static boolean addNewUser(User user) throws Exception
    {
        Connection connection = getConnection();
        
        PreparedStatement statement = connection.prepareStatement("INSERT INTO User VALUES (?,?,?,?,0)");
        statement.setString(1, user.getFirstname());
        statement.setString(2, user.getLastname());
        statement.setString(3, user.getUsername());
        statement.setString(4, user.getPassword());
        
        statement.executeUpdate();
        
        return true;
    }
    
    public static User getUser(String username)
    {
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM User WHERE username = ?");
            statement.setString(1, username);
            
            ResultSet result = statement.executeQuery();
            result.next();
            
            return new User(result.getString("firstname"),result.getString("lastname"),result.getString("username"),result.getString("password"),result.getInt("status"));
            
            
        } catch (Exception e) {
        }
        return null;
    }
    
    
    public static boolean validUsername(String username)
    {
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM User WHERE username = ?");
            statement.setString(1, username);
          
            ResultSet result = statement.executeQuery();
            result.next();
            
            result.getString("username");
            return true;
            
            
            
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean validPassword(String username , String password)
    {
        try {
             Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT password FROM User WHERE username = ?");
             statement.setString(1,username);
        
             ResultSet result = statement.executeQuery();
             result.next();
             
             String pass = result.getString("password");
             
             if(pass.equals(password))
                    return true;
        
        } catch (Exception e) {
        }
        return false;
    }
    
    public static int getStatus(String username)
    {
         try {
             Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT status FROM User WHERE username = ?");
             statement.setString(1,username);
        
             ResultSet result = statement.executeQuery();
             result.next();
             
             int status = result.getInt("status");
             
             return status;
        
        } catch (Exception e) {
        }
        return -1;
    }
    
    public static boolean updateStatus (String username)
    {
         try {
             Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT status FROM User WHERE username = ?");
             statement.setString(1,username);
        
             ResultSet result = statement.executeQuery();
             result.next();
             
             int status = result.getInt("status");
             int newstatus=1;
             
             if(status != 0)
                 newstatus = 0;
             
             statement = connection.prepareStatement("UPDATE User SET status = ? WHERE username = ?");
             statement.setInt(1, newstatus);
             statement.setString(2,username);
             
             statement.executeUpdate();
             return true;
             
             
        
        } catch (Exception e) {
        }
        return false;
    }
    
    public static ArrayList<Movies> getMovies()
    {
        ArrayList<Movies> movies = new ArrayList<>();
        
         try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Movies");
          
            ResultSet result = statement.executeQuery();
            while(result.next())
            {
                Movies m = new Movies(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getString(7),result.getString(8),result.getString(9),result.getString(10),result.getString(11),result.getString(12));
                movies.add(m);
            }
            
            return movies;
            
            
        } catch (Exception e) {
            System.out.println("Error in getMoveis :"+e.getMessage());
        }
        return null;
  
    }


    
}

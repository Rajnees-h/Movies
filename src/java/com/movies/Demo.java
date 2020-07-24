/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies;

import java.util.ArrayList;

/**
 *
 * @author rowdy
 */
public class Demo {
    
    public static void main(String[] args) {
        
        ArrayList<Movies> movies = DbConnection.getMovies();
        
        for(Movies m : movies)
                System.err.println(m.movie_name);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author khlop
 */
public class Follow {
    private String hoja;
    private ArrayList<Integer> follow;

    public Follow(String hoja) {
        this.hoja = hoja;
        this.follow = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getFollow() {
        return follow;
    }
    
    public String getHoja(){
        return hoja;
    }
    
    
    
}

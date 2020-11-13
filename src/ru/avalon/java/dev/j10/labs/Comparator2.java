/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author Meerkat
 */
public class Comparator2 implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        return -s1.compareTo(s2);
    }
    
}

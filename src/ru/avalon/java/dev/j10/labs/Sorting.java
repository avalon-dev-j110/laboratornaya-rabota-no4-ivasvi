/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Meerkat
 */
public class Sorting implements Sort{

    @Override
    public void sort(Object[] array) {
        Arrays.sort(array);
    }

    @Override
    public void sort(Comparable[] array) {
        Arrays.sort(array);
    }
    
    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }
    
}

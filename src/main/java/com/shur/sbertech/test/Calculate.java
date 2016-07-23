/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.sbertech.test;

/**
 *
 * @author таня
 */
public class Calculate {
    static int calc(int a, int b, String operation){
        if("+".equals(operation)){return a+b;}
        if("-".equals(operation)){return a-b;}
        if("*".equals(operation)){return a*b;}
        if("/".equals(operation)){return a/b;}
        return 0;
    }
    
}

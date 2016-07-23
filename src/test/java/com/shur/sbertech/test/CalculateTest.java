/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shur.sbertech.test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author таня
 */
@RunWith(value = Parameterized.class)
public class CalculateTest {
    
    private int firstOperand;
    private int secondOperand;
    private String operator;
    private int result;
    
    public CalculateTest(int firstOperand, int secondOperand, String operator, int result) {
        this.firstOperand = firstOperand;
        this.secondOperand= secondOperand;
        this.operator = operator;
        this.result = result;
    }
    
    @Parameters
    public static Collection<Object[]> data() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("TestData"));
        List<Object[]> res = new ArrayList<Object[]>();
        String s;        
        while((s = reader.readLine()) != null) {
            String[] params = s.split("\\;");
            Object[] curData = new Object[4];
            curData[0] = Integer.parseInt(params[0]);
            curData[1] = Integer.parseInt(params[1]);
            curData[2] = params[2];
            curData[3] = Integer.parseInt(params[3]);
            res.add(curData);
       } 
       return res;
    }
    
    @Test
    public void testCalc() {
        Assert.assertEquals(Calculate.calc(firstOperand, secondOperand, operator), result);
    }
}
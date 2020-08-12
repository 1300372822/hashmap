package com.luban;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static void main(String[] args) {
        HashMap<String,String>  hashMap = new HashMap<>();
        hashMap.put("name","fengqingyang");//key------->key.hashcode()------>3373707----->table.length----->index0,7


        hashMap.get("name");
        System.out.println("name".hashCode());
        ArrayList list = new ArrayList();
        list.add(new Object());
        list.add(new Object());
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}

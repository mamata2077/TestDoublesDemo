package com.agile.testDoubles.spyDemo;

import org.junit.Test;  
import org.mockito.Mockito;  
import junit.framework.Assert;  
  
public class Abstract1Test {  
  
    @Test  
    public void testing_usingSpy() {  
         Abstract1Class abstclas = Mockito.spy(Abstract1Class.class);  
           
         String res = abstclas.methodUnderTest();  
         Assert.assertEquals("one", res);  
    }  
 }  

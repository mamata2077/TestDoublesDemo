package com.agile.testDoubles.mockDemo.mockAbstractClassDemo;

import static org.junit.Assert.*;  
import static org.mockito.Mockito.mock;  
import static org.mockito.Mockito.when;  
  
import org.junit.Test;  
  
public class AbstractTestClass {  
  
    @Test  
    public void test_AbstractClasses() {  
          
        AbstractClass ac = mock(AbstractClass.class);  
        when(ac.sayMock()).thenCallRealMethod();  
        when(ac.getName()).thenReturn("Jyotika");  
        assertEquals("Hii.. Jyotika!!", ac.sayMock());    
    }  
  }  

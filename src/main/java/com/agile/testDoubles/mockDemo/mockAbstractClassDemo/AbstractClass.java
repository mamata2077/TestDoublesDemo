package com.agile.testDoubles.mockDemo.mockAbstractClassDemo;

public abstract class AbstractClass {  
  
    public String sayMock() {  
        return "Hii.. " + getName() + symbol() ;  
    }  
      
    private String symbol() {  
        return "!!";  
    }  
      
    protected abstract String getName();  
      }  
    
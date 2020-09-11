package com.agile.testDoubles.FakeAndStubDemo;

import java.util.HashMap;


public interface StudentScoreService {
    //actual implementation connects to db and fetch scores for studentId
    public HashMap<String,Integer>  getScores(String studentId);
    
}

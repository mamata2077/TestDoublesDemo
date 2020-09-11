package com.agile.testDoubles.FakeAndStubDemo;

import java.util.HashMap;

public class StudentScoreServiceFake implements StudentScoreService {
    static  HashMap<String,Integer> scores = new HashMap<String,Integer>();

    public HashMap<String, Integer> getScores(String studentId) {
      //instead of connecting to real db, populate data in inmemory hashmap and return that stub
        scores.put("English", 80);
        scores.put("Science", 90);
        scores.put("Maths", 98);
        scores.put("History",88);

        return scores;
    }
    
    
}

package com.agile.testDoubles.FakeAndStubDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class StudentResultPublisher {
    StudentScoreService scoreService;
    public StudentResultPublisher(StudentScoreService scoreService){
        this.scoreService = scoreService;
    }

    public HashMap<String,Integer>  fetchScoresByStudentId(String studentId){
        return scoreService.getScores(studentId);
    }
    public int calculateTotalScore(HashMap<String,Integer> scores){
        //logic to calculate total scores
        Iterator<Entry<String,Integer>> iterator = scores.entrySet().iterator();
        int totalScore = 0;
        while (iterator.hasNext()) { 
            HashMap.Entry<String,Integer> mapElement = (HashMap.Entry<String,Integer>)iterator.next(); 
            int marks = (Integer) mapElement.getValue();
            totalScore = totalScore + marks;
        } 
        return totalScore;
            
     }

    public int calculatePercentage(HashMap<String,Integer> scores){
            int totalScore = calculateTotalScore(scores);
            //logic to calculate percentage of scores
            int noOfSubjects = scores.size();
            return  (totalScore / noOfSubjects) ;
                
    }
            
}

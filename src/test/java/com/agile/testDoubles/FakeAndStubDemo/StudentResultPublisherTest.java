package com.agile.testDoubles.FakeAndStubDemo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class StudentResultPublisherTest {
    @Test
    public void shouldReturnTotalScoreWhenIndividualScoresOfSubjectsAreFetched(){
        //Arrange
        StudentScoreServiceFake studentScoreServiceFake = new StudentScoreServiceFake();
        StudentResultPublisher resultPublisher = new StudentResultPublisher(studentScoreServiceFake);
        HashMap<String,Integer> scores = resultPublisher.fetchScoresByStudentId("fakeId");
        //Act
        int totalScore = resultPublisher.calculateTotalScore(scores);
        //Assert
        assertEquals(356,totalScore);
    }

    @Test
    public void shouldReturnAverageScoreWhenIndividualScoresOfSubjectsAreFetched(){
         //Arrange
         StudentScoreServiceFake studentScoreServiceFake = new StudentScoreServiceFake();
         StudentResultPublisher resultPublisher = new StudentResultPublisher(studentScoreServiceFake);
         HashMap<String,Integer> scores = resultPublisher.fetchScoresByStudentId("fakeId");
         //Act
         int totalScore = resultPublisher.calculatePercentage(scores);
         //Assert
         assertEquals(89,totalScore);
     }
    }


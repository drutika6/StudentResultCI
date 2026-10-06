package com.example.studentresult;

public class StudentResult {

    public int calculateTotal(int marks1, int marks2, int marks3) {
        return marks1 + marks2 + marks3;
    }

    public double calculateAverage(int marks1, int marks2, int marks3) {
        return calculateTotal(marks1, marks2, marks3) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
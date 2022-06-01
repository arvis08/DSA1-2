package com.company.OOPS;

public class Student implements Comparable<Student> {

    public Student(int rollNumber, int marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    int rollNumber;
    int marks;

    public int compareTo(Student s){   //compulsory to make compareTo function to implement Comparable
        return this.marks-s.marks;
    }
}

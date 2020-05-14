package com.techhub.maymeetup;

import com.techhub.classroom.Course;
import com.techhub.classroom.Faculty;
import com.techhub.classroom.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	  //Create Objects using the new Keyword, invoke a constructor.
        Faculty faculty = new Faculty("C026","Computer Science & IT");
        Course bbit = new Course("Business Information Technology","BBIT",faculty,2020);
        Student frank = new Student();
        Student elizabeth = new Student("Elizabeth","female",2 ,"0790889234", "Eliza","12345", bbit);

        //lIST
        List<Student> students = new ArrayList<Student>();
        students.add(elizabeth);
        //students.add(frank);
        System.out.println("Total Number of students "+students.size());
        System.out.println(elizabeth.toString());



    }
}

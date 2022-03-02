package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //TODO
        return students.get( studentId );
    }
    public boolean showSummary()
    {
        //TODO
        if(students.isEmpty())return false;
        for (Student student : students.values()) {
            System.out.println("Student Information: ");
            System.out.println(student);
            if(student.getEnrolledCourses().isEmpty()) {
                System.out.println("No enrolled course");
                continue;
            }
            for (Course course : student.getEnrolledCourses().values()) {
                System.out.println("Student enrolled course: ");
                System.out.println(course);
            }
            System.out.println("End of List");
        }
        return true;
    }
    public void enrollToCourse( String studentId, Course course )
    {
        //TODO
        findStudent(studentId).enrollToCourse(course);
    }
}

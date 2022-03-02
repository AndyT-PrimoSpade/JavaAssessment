package com.generation.model;

import java.util.*;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;
    private Map<String, Course> enrollCourses = new HashMap<String, Course>();
    private Map<String,Float> gradeStudentCourse = new HashMap<String, Float>();
    private Map<String, Course> passCourses = new HashMap<String, Course>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO
        enrollCourses.put(course.getCode(),course);
    }
    @Override
    public Map<String, Course> findPassedCourses()
    {
        //TODO
        if(gradeStudentCourse.isEmpty()) return null;
        gradeStudentCourse.forEach((courseId,grade)->{
            if(grade>=3.0F) passCourses.put(courseId,enrollCourses.get(courseId));
        });
        return passCourses;
    }
    public Course findCourseById( String courseId )
    {
        //TODO
        return enrollCourses.get(courseId);
    }
    @Override
    public Map<String, Course> getEnrolledCourses()
    {
        //TODO
        return enrollCourses;
    }

    public void setGrade(String courseID, float grade){
        gradeStudentCourse.put(courseID,grade);
    }

    public Map<String, Float> getGrade(){
        return gradeStudentCourse;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}

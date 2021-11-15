package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import java.util.List;


public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse(Long courseID);
	
	public Course addCourse(Course course);
}
package com.springrest.springrest.services;

	
	import java.util.List;
	import java.util.ArrayList;

    import com.springrest.springrest.dao.CourseDao;
    import com.springrest.springrest.entities.Course;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

	@Service
	public class CourseServiceImpl implements CourseService {
		@Autowired
		private CourseDao courseDao;
		
		List<Course> list;
		
		public CourseServiceImpl() {
			
			list =new ArrayList<>();
			list.add(new Course(145 ,"Java Core", "Basics of Java"));
			list.add(new Course(155 , "D365" , "ERP "));
		}

		@Override
		public List<Course> getCourses() {
			//return list;
			return courseDao.findAll();
		}

		
		@Override
		public Course getCourse(Long courseId) {
//		Course c=null;
//	    for(Course course:list)
//		{
//			if (course.getId() == courseId)
//					{
//				      c=course;
//				      break;
//					}
//		}
			
			return courseDao.getById(courseId);
		}

		@Override
		public Course addCourse(Course course) {
		//	list.add(course);
			return courseDao.save(course);
		
		}
		
		
		

	}


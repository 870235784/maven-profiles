package com.tca.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tca.beans.Student;
import com.tca.beans.Teacher;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config/spring-*.xml"})
public class StudentServiceTest {
	
	@Autowired
	private Student student;
	
	@Autowired
	private Teacher teacher;
	
	@Test
	public void test01() {
		System.out.println(student.getUsername());
		System.out.println(student.getPassword());
	}
	
	@Test
	public void test02() {
		System.out.println(teacher.getUsername());
		System.out.println(teacher.getPassword());
	}
}

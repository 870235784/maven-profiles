package com.tca.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tca.beans.Student;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-config/spring-*.xml"})
public class StudentServiceTest {
	
	@Autowired
	private Student student;
	
	@Test
	public void test01 () {
		System.out.println(student.getUsername());
		System.out.println(student.getPassword());
	}
}

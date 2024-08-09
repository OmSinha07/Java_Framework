package com.example1.SPRINGJDBCEx;

import com.example1.SPRINGJDBCEx.Model.Student;
import com.example1.SPRINGJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringjdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringjdbcExApplication.class, args);
		Student s=context.getBean(Student.class);
		s.setRollno(105);
		s.setName("Om");
		s.setMarks(70);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}

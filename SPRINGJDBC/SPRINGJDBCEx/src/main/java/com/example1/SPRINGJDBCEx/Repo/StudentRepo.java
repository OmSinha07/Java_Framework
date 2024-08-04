package com.example1.SPRINGJDBCEx.Repo;

import com.example1.SPRINGJDBCEx.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.JDBCType;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate Jdbc;

    public JdbcTemplate getJdbc() {
        return Jdbc;
    }
@Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        Jdbc = jdbc;
    }

    public void save(Student s)
   {
       String sql="Insert into Student (rollno,name,marks) values(?,?,?)";
       int rows=Jdbc.update(sql,s.getName(),s.getMarks(),s.getRollno());
       System.out.println(rows);
   }

    public List<Student> findAll() {
    List<Student> students=new ArrayList<>();
    return students;
    }
}

package com.example1.SPRINGJDBCEx.Repo;

import com.example1.SPRINGJDBCEx.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public void save(Student s) {
        String sql = "insert into student (rollno,name,marks) values(?,?,?)";
        int rows = Jdbc.update(sql, s.getRollno(), s.getName(), s.getMarks());
        System.out.println(rows + " effected");
    }

//    public List<Student> findAll() {
//        String sql = "Select * from student";
//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setRollno(rs.getInt("rollno"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//
//                return s;
//            }
//
//        };
//        return Jdbc.query(sql, mapper);
//    }
public List<Student> findAll() {//Lamda expression
    String sql = "Select * from student";
    return Jdbc.query(sql,(rs,rowNum)-> {

            Student s = new Student();
            s.setRollno(rs.getInt("rollno"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));

            return s;


    });
}
}

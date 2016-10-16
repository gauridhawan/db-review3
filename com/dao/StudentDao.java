package com.dao;
import  com.entities.Student;

import java.util.List;

/**
 * Created by GAURI DHAWAN on 9/4/2016.
 */
public interface StudentDao {
    void createStudentTable();

  void insert(Student student);
//    Student selectById(String regno);

   // List<Student> selectAll();

    //void delete(String regno);
   // void update(Student student,String regno);
}

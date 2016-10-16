package com.dao;

import com.entities.Student;
import com.util.ConnectionConfiguration;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GAURI DHAWAN on 9/4/2016.
 */
public class StudentDaoImpl implements StudentDao {
    // @Override
    //public void createStudentTable(){
    @Override
    public void createStudentTable() {

        Connection connection = null;
        Statement statement = null;

        // connection=DbConnect.DbConnect();
        try {
            connection = ConnectionConfiguration.getConnection();

            statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS student(first_name varchar(20),id varchar(20) unique primary key )");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }



        /* Connection connection=null;
        Statement statement = null;

        try {
            connection= ConnectionConfiguration.getConnection();
            statement=connection.createStatement();
           // statement.execute("CREATE TABLE IF NOT EXISTS student(id varchar2(10) primary key unique auto_increment,
             //       "first_name varchar(55),last_name varchar(55))");
            statement.execute("CREATE TABLE IF NOT EXISTS student(id int unique primary key auto_increment,first_name varchar(20),last_name varchar(20))");
           // statement.execute("CREATE TABLE IF NOT ")
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(statement!=null)
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            }

        }

    }*/

    //@Override
    public  void insert(Student student) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO Student (name,id)" +
                    "VALUES(?,?)");
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getId());
            preparedStatement.executeUpdate();
            System.out.println("INSERT INTO Student (name,id)" +

                    "VALUES(?,?)");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    //@Override
   public Student selectById(String id) {
        Student student = new Student();
        Connection connection= null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet=null ;

        try{
            connection=ConnectionConfiguration.getConnection();
            preparedStatement=connection.prepareStatement("SELECT * FROM Student WHERE id = ? ");
            preparedStatement.setString(1,id);
            resultSet=preparedStatement.executeQuery();

            while(resultSet.next()){
                student.setId(resultSet.getString("id"));
                student.setFirstName(resultSet.getString("name"));
            }

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return student ;


    }

    //@Override
    public List<Student> selectAll() {
        List<Student> students=new ArrayList<Student>();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try{
            connection=ConnectionConfiguration.getConnection();
            statement=connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM Student");
            while(resultSet.next()){
                Student student=new Student();
                student.setId(resultSet.getString("id") );
                student.setFirstName(resultSet.getString("name"));
                students.add(student);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return students;
    }

    //@Override
    public  void delete(String id){
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try{
            connection=ConnectionConfiguration.getConnection();
            preparedStatement=connection.prepareStatement("DELETE FROM Student WHERE id = ? ");
            preparedStatement.setString(1,id);
            preparedStatement.executeUpdate();

            System.out.println("DELETE FROM Student WHERE id = ? ");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void update(Student student,String id){
        Connection connection=null;
        PreparedStatement preparedStatement=null;

        try{
            connection=ConnectionConfiguration.getConnection();
            preparedStatement=connection.prepareStatement("UPDATE Student SET "+
            "name=? WHERE id=?");
            preparedStatement.setString(1,student.getFirstName());
            preparedStatement.setString(2,student.getId());
            preparedStatement.executeUpdate();

            System.out.println("UPDATE Student SET "+
                    "firstName=? WHERE id=?");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(preparedStatement!=null){
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
//}

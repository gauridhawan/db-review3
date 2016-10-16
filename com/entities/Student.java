package com.entities;

/**
 * Created by GAURI DHAWAN on 9/4/2016.
 */
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    public Student(){

    }
    public Student(String firstName,String id){
        this.firstName=firstName;
        this.id=id;
       // this.lastName=lastName;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

//    public String getLastName() {
  //      return lastName;
   // }

    //public void setLastName(String lastName) {
      //  this.lastName = lastName;
    //}

}

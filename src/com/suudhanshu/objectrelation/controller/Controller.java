/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suudhanshu.objectrelation.controller;

import com.suudhanshu.objectrelation.DAO.CourseDAO;
import com.suudhanshu.objectrelation.DAO.StudentDAO;
import com.suudhanshu.objectrelation.DAOImpl.CourseDAOImpl;
import com.suudhanshu.objectrelation.DAOImpl.StudentDAOImpl;
import com.suudhanshu.objectrelation.entity.Course;
import com.suudhanshu.objectrelation.entity.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sudhanshu
 */
public class Controller {
     CourseDAO courseDAO = new CourseDAOImpl();
    StudentDAO studentDAO = new StudentDAOImpl();

    public void CourseAdd() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Core Java\\data\\course.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                Course course = new Course();
                course.setId(Integer.parseInt(tokens[0]));
                course.setCourseName(tokens[1]);
                courseDAO.add(course);

            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

       

    }
    public void StudentAdd(){
        try {
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Core Java\\data\\student.txt"));
         String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens1 = line.split(",");
                
           Student student = new Student();
                
               student.setId(Integer.parseInt(tokens1[0]));              
               student.setFirstName(tokens1[1]);
             student.setLastName(tokens1[2]);
               
              for(Course c : courseDAO.getAll()){
                   if(Integer.parseInt(tokens1[3])==c.getId()){
                      student.setCourse(c.getCourseName());
                     
                  }
               }
                
                
               studentDAO.add(student);

            }
        
    } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
         for (Student st : studentDAO.getAll()) {
            System.out.println(st.getId());
            System.out.println(st.getFirstName());
             System.out.println(st.getLastName());
             System.out.println(st.getCourse());
            

        }
    }
}

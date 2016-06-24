/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suudhanshu.objectrelation.DAOImpl;

import com.suudhanshu.objectrelation.DAO.StudentDAO;
import com.suudhanshu.objectrelation.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Sudhanshu
 */
public class StudentDAOImpl implements StudentDAO {
    ArrayList<Student> studentList = new ArrayList<>();
    @Override
    public boolean add(Student s) {
      studentList.add(s);
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<Student> getAll() {
     return studentList;
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suudhanshu.objectrelation.DAOImpl;

import com.suudhanshu.objectrelation.DAO.CourseDAO;
import com.suudhanshu.objectrelation.entity.Course;
import java.util.ArrayList;

/**
 *
 * @author Sudhanshu
 */
public class CourseDAOImpl implements CourseDAO {
     ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public boolean add(Course s) {
        courseList.add(s);
        return false;

    }

    @Override
    public Course getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Course> getAll() {
        return courseList;
}
}

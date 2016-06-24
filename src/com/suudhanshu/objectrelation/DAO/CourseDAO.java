/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suudhanshu.objectrelation.DAO;

import com.suudhanshu.objectrelation.entity.Course;
import java.util.ArrayList;

/**
 *
 * @author Sudhanshu
 */
public interface CourseDAO {
     boolean add (Course s);
    Course getById(int id);
    ArrayList<Course> getAll();
}

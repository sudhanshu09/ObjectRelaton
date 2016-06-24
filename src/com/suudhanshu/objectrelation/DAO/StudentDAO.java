/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.suudhanshu.objectrelation.DAO;

import com.suudhanshu.objectrelation.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Sudhanshu
 */
public interface StudentDAO {
     boolean add (Student s);
    
    ArrayList<Student> getAll(); 
}

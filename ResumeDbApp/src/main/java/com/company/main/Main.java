/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.main;

import com.company.bean.User;
import com.company.dao.impl.UserDaoImpl;
import com.company.dao.inter.UserDaoInter;
import java.util.List;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) throws Exception {
        UserDaoInter userDao = Context.instanceUserDao();
        List<User> list = userDao.getAll();
        userDao.removeUser(1);
       List<User> list2 = userDao.getAll();
       System.out.println("list=" + list);
       System.out.println("list2=" + list2);
        User u = userDao.getById(2);
//        u.setId(2);
        u.setName("Eldar2");
        userDao.updateUser(u);
        System.out.println("update="+u);

    }
}

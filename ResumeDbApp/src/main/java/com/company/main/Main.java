/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.main;

import com.company.dao.inter.CountryDaoInter;
import com.company.dao.inter.SkillDaoInter;
import com.company.dao.inter.UserDaoInter;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) throws Exception {
      //UserSkillDaoInter userDao = Context.instanceUserSkillDao();
       //EmploymentHistoryDaoInter empDao = Context.instanceEmploymentHistoryDao();
       UserDaoInter userDao = Context.instanceUserDao();
       CountryDaoInter countDao = Context.instanceCountryDao();
       SkillDaoInter skillDao = Context.instanceSkillDao();
//        List<User> list = userDao.getAll();
//        userDao.removeUser(1);
//        List<User> list2 = userDao.getAll();
//        System.out.println("list=" + list);
//        System.out.println("list2=" + list2);
//        User u = userDao.getById(2);
//        u.setId(2);
//        u.setName("Eldar");
//        userDao.updateUser(u);
//        System.out.println("update=" + u);
        //User u2 = new User(0,"Sarkhan","Rasullu","994555556724","sarkhanrasullu@gmail.com");
//        userDao.addUser(u2);
//        System.out.println("add="+u2);
           //System.out.println( userDao.getAll());
           //System.out.println(empDao.getAllEmploymentHistoryByUserId(6));
           //System.out.println(countDao.getAll());
           System.out.println("SkillId = "+skillDao.getById(+1));
           System.out.println("AllSkill="+ skillDao.getAll());
           
          

    }
}

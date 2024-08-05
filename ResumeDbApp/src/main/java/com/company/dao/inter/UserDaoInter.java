/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import com.company.bean.User;
import java.util.List;

/**
 *
 * @author HP
 */
public interface UserDaoInter {
    public List<User> getAll();
    public User getById(int userId);
    public boolean updateUser(User u);
    public boolean removeUser(int id);
}

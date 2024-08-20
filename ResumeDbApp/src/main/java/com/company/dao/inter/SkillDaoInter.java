/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.inter;

import com.company.entity.Skill;
import com.company.entity.User;
import java.util.List;

/**
 *
 * @author HP
 */
public interface SkillDaoInter {
    public List<Skill> getAll();
    public Skill getById(int Id);
    public boolean update(Skill s);
    public boolean add(Skill s);
    public boolean remove(int id);
}

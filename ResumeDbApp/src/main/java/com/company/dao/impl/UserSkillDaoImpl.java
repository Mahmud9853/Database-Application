/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity.Skill;
import com.company.entity.User;
import com.company.entity.UserSkill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class UserSkillDaoImpl extends AbstractDAO implements UserSkillDaoInter {

    private UserSkill getUserSkill(ResultSet rs) throws Exception {
        int userSkillId = rs.getInt("userSkillId");
        int userId = rs.getInt("id");
        int skillId = rs.getInt("skill_id");
        String skillName = rs.getString("skill_name");
        int power = rs.getInt("power");

        return new UserSkill(userSkillId, new User(userId), new Skill(skillId, skillName), power);

    }

    @Override
    public List<UserSkill> getAllSkillByUserId(int userId) {
        List<UserSkill> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("SELECT "
                    + " us.id as userSkillId, "
                    + " u.*,"
                    + " us.skill_id, "
                    + " s.NAME as skill_name, "
                    + " us.power "
                    + "FROM "
                    + " user_skill us "
                    + " LEFT JOIN USER u ON us.user_id = u.id "
                    + " LEFT JOIN skill s ON us.skill_id = s.id "
                    + "WHERE "
                    + " us.user_id = ?");
            stmt.setInt(1, userId);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                UserSkill u = getUserSkill(rs);
                result.add(u);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean addUserSkill(UserSkill u) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into user_skill(skill_id, user_id, power) values(?, ?, ?)");
            stmt.setInt(1, u.getSkill().getId());
            stmt.setInt(2, u.getUser().getId());
            stmt.setInt(3, u.getPower());
            return stmt.execute();
            //ResultSet rs = stmt.getResultSet();
          
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        
    }

    @Override
    public boolean removeUser(int id) {
        try (Connection c = connect()) {

            PreparedStatement stmt = c.prepareStatement("Delete from user_skill where id=" + id);
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUserSkill(UserSkill u) {
       
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update user_skill set skill_id=?, user_id=?, power=? where id=?");
            stmt.setInt(1, u.getSkill().getId());
            stmt.setInt(2, u.getUser().getId());
            stmt.setInt(3,u.getPower());
            stmt.setInt(4, u.getId());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}

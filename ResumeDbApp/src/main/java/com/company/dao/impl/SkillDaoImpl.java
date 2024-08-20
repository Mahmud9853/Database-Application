/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.dao.impl;

import com.company.dao.inter.AbstractDAO;
import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class SkillDaoImpl extends AbstractDAO implements SkillDaoInter {

    private Skill getSkill(ResultSet rs) throws Exception {
        int Id = rs.getInt("id");
        String name = rs.getString("name");

        return new Skill(Id, name);

    }

    @Override
    public List<Skill> getAll() {
        List<Skill> result = new ArrayList<>();

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("select * from skill");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Skill skill = getSkill(rs);
                result.add(skill);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;

    }

    @Override
    public Skill getById(int Id) {
        Skill result = null;
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            stmt.execute("select * from skill where id=" + Id);
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {

                result = getSkill(rs);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean update(Skill s) {
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("update skill set where name=?  where id=?");
            stmt.setString(1, s.getName());
            return stmt.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean add(Skill s) {
        boolean success = true;
        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("insert into skill(name) values(?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, s.getName());
            success = stmt.execute();
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                s.setId(generatedKeys.getInt(1));
            }
            System.out.println("uğurla əlavə edildi!");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return success;

    }

    @Override
    public boolean remove(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("Delete from skill where id = " + id);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}

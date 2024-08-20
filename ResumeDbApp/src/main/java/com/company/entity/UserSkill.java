/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

/**
 *
 * @author HP
 */
public class UserSkill {

    private Integer Id;
    private User user;
    private Skill skill;
    private int power;

    public UserSkill(Integer id, User user, Skill skill, int power) {
        this.Id = id;
        this.user = user;
        this.skill = skill;
        this.power = power;
    }

    public UserSkill() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "UserSkill{" + "Id=" + Id + ", user=" + user + ", skill=" + skill + ", power=" + power + '}';
    }
    

}

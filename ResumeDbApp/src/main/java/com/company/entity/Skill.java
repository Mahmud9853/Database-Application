/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

/**
 *
 * @author HP
 */
public class Skill {

    private int Id;
    private String name;

    public Skill() {
    }

    public Skill(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

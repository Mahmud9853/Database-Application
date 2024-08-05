/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bean;

/**
 *
 * @author HP
 */
public class User {

    private int Id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public User() {
    }

    public User(int Id, String name, String surname, String phone, String email) {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email + '}';
    }
}

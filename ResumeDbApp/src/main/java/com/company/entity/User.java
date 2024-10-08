/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

import java.sql.Date;
import java.util.List;

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
    private String profileDesc;
    private String address;
    private Date birthDate;
    private Country nationality;
    private Country birthPlace;
    private List<UserSkill> skills;

    public User(int Id, String name, String surname, String phone, String email, String profileDesc, String address, Date birthDate, Country nationality, Country birthPlace) {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.profileDesc = profileDesc;
        this.address = address;
        this.birthDate = birthDate;
        this.nationality = nationality;
        this.birthPlace = birthPlace;
   
    }

    public User() {
    }

    public User(int Id) {
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public Country getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Country birthPlace) {
        this.birthPlace = birthPlace;
    }

    public List<UserSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<UserSkill> skills) {
        this.skills = skills;
    }

    public String getProfileDesc() {
        return profileDesc;
    }

    public void setProfileDesc(String profileDesc) {
        this.profileDesc = profileDesc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" + "Id=" + Id + ", name=" + name + ", surname=" + surname + ", phone=" + phone + ", email=" + email + ", profileDesc=" + profileDesc + ", address=" + address + ", birthDate=" + birthDate + ", nationality=" + nationality + ", birthPlace=" + birthPlace + ", skills=" + skills + '}';
    }

    public void setBirthDate(java.util.Date birthDate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}

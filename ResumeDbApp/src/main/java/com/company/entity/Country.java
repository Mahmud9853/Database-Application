/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

/**
 *
 * @author HP
 */
public class Country {
    private int Id;
    private String name;
    private String nationality;

    @Override
    public String toString() {
        return  name + ", " + nationality ;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Country(int id, String name, String nationality) {
        this.Id = id;
        this.name = name;
        this.nationality = nationality;
    }

    public Country() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.Id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (this.Id != other.Id) {
            return false;
        }
        return true;
    }
    
}

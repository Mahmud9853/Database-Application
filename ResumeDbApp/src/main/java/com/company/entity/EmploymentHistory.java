/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.entity;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class EmploymentHistory {

    private Integer Id;
    private String header;
    private String jobDescription;
    private Date beginDate;
    private Date endDate;
    private User user;

    public EmploymentHistory(Integer id, String header, String jobDescription, Date beginDate, Date endDate, User user) {
        this.Id = id;
        this.header = header;
        this.jobDescription = jobDescription;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.user = user;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public EmploymentHistory() {
    }

    public int getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "EmploymentHistory{" + "Id=" + Id + ", header=" + header + ", jobDescription=" + jobDescription + ", beginDate=" + beginDate + ", endDate=" + endDate + ", user=" + user + '}';
    }

}

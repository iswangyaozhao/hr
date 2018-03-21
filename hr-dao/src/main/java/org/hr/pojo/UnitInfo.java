package org.hr.pojo;

import java.util.Date;

public class UnitInfo {
    private Integer id;

    private Date entrytime;

    private Integer jobs;

    private Integer employeeswork;

    private Integer position;

    private Integer jobtitle;

    private String basicsalary;

    private Integer status;

    private Integer bank;

    private String account;

    private String photo;

    private Integer sectionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Integer getJobs() {
        return jobs;
    }

    public void setJobs(Integer jobs) {
        this.jobs = jobs;
    }

    public Integer getEmployeeswork() {
        return employeeswork;
    }

    public void setEmployeeswork(Integer employeeswork) {
        this.employeeswork = employeeswork;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(Integer jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(String basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }
}
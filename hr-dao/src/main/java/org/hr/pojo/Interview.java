package org.hr.pojo;

public class Interview {
    private Integer id;

    private String subject;

    private String text;

    private String remark;

    private Integer interviewinfoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getInterviewinfoId() {
        return interviewinfoId;
    }

    public void setInterviewinfoId(Integer interviewinfoId) {
        this.interviewinfoId = interviewinfoId;
    }
}
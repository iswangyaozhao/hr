package org.hr.pojo;

public class RenewInfo {
    private Integer id;

    private String time;

    private Integer type;

    private String operanttime;

    private String expiretime;

    private Integer contractinfoId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOperanttime() {
        return operanttime;
    }

    public void setOperanttime(String operanttime) {
        this.operanttime = operanttime;
    }

    public String getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(String expiretime) {
        this.expiretime = expiretime;
    }

    public Integer getContractinfoId() {
        return contractinfoId;
    }

    public void setContractinfoId(Integer contractinfoId) {
        this.contractinfoId = contractinfoId;
    }
}
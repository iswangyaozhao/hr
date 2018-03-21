package org.hr.pojo;

public class ChangeInfo {
    private Integer id;

    private String time;

    private Integer type;

    private Integer contractinfoId;

    private String updatetext;

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

    public Integer getContractinfoId() {
        return contractinfoId;
    }

    public void setContractinfoId(Integer contractinfoId) {
        this.contractinfoId = contractinfoId;
    }

    public String getUpdatetext() {
        return updatetext;
    }

    public void setUpdatetext(String updatetext) {
        this.updatetext = updatetext;
    }
}
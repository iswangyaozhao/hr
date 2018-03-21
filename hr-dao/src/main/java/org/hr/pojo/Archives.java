package org.hr.pojo;

import java.util.Date;

public class Archives {
    private Integer id;

    private String worknum;

    private Integer dsectionId;

    private Integer sex;

    private String name;

    private Date birthday;

    private Integer marital;

    private Integer politicalface;

    private String health;

    private String idcard;

    private Details details;

    private Integer archivesUnitinfoId;

    private Integer archivesOtherinfoId;

    private String salt;

    private Integer nativeplace;

    private Integer national;

    private Integer contractinfoId;

    private Integer titleassessinfoId;

    private Integer certificateinfoId;

    private Integer rewardspunishmentsinfoId;

    
    public Details getDetails() {
		return details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorknum() {
        return worknum;
    }

    public void setWorknum(String worknum) {
        this.worknum = worknum;
    }

    public Integer getDsectionId() {
        return dsectionId;
    }

    public void setDsectionId(Integer dsectionId) {
        this.dsectionId = dsectionId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getMarital() {
        return marital;
    }

    public void setMarital(Integer marital) {
        this.marital = marital;
    }

    public Integer getPoliticalface() {
        return politicalface;
    }

    public void setPoliticalface(Integer politicalface) {
        this.politicalface = politicalface;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }


    public Integer getArchivesUnitinfoId() {
        return archivesUnitinfoId;
    }

    public void setArchivesUnitinfoId(Integer archivesUnitinfoId) {
        this.archivesUnitinfoId = archivesUnitinfoId;
    }

    public Integer getArchivesOtherinfoId() {
        return archivesOtherinfoId;
    }

    public void setArchivesOtherinfoId(Integer archivesOtherinfoId) {
        this.archivesOtherinfoId = archivesOtherinfoId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(Integer nativeplace) {
        this.nativeplace = nativeplace;
    }

    public Integer getNational() {
        return national;
    }

    public void setNational(Integer national) {
        this.national = national;
    }

    public Integer getContractinfoId() {
        return contractinfoId;
    }

    public void setContractinfoId(Integer contractinfoId) {
        this.contractinfoId = contractinfoId;
    }

    public Integer getTitleassessinfoId() {
        return titleassessinfoId;
    }

    public void setTitleassessinfoId(Integer titleassessinfoId) {
        this.titleassessinfoId = titleassessinfoId;
    }

    public Integer getCertificateinfoId() {
        return certificateinfoId;
    }

    public void setCertificateinfoId(Integer certificateinfoId) {
        this.certificateinfoId = certificateinfoId;
    }

    public Integer getRewardspunishmentsinfoId() {
        return rewardspunishmentsinfoId;
    }

    public void setRewardspunishmentsinfoId(Integer rewardspunishmentsinfoId) {
        this.rewardspunishmentsinfoId = rewardspunishmentsinfoId;
    }
}
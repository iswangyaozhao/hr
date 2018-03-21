package org.hr.pojo;

import java.util.List;

public class User {
 

	private Integer id;

    private String username;

    private String password;

    private String salt;

    private Archives archives;

    private Integer statu;

    private List<Role> roles;
    
    private Role role;
    
    private String remark;
    
    public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	private String usercode;

    public Integer getId() {
        return id;
    }

    public Archives getArchives() {
		return archives;
	}

	public void setArchives(Archives archives) {
		this.archives = archives;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }


    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }
    @Override
 	public String toString() {
 		return "User [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt + ", archives="
 				+ archives + ", statu=" + statu + ", roles=" + roles + ", role=" + role + ", usercode=" + usercode
 				+ "]";
 	}


}
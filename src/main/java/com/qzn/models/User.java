package com.qzn.models;

import java.sql.Timestamp;
import java.util.Date;

public class User {
	public static final Integer LOGIN_LOCK_STATUS_UNLOCK = 0; // 未锁定
	public static final Integer LOGIN_LOCK_STATUS_LOCKING = 1; // 锁定中

	public static final Integer PASSWORD_STATUS_SYSINIT = 0; // 初期化
	public static final Integer PASSWORD_STATUS_USERRESET = 1; // 再设定

	public static final Integer DELETE_FLAG_UNDELETE = 0; // 未删除
	public static final Integer DELETE_FLAG_DELETED = 1; // 已删除

	public static final Integer ALL_POWER = 100; // 全部权限

	private Long id;

	private String username;

	private String fullname;

	private String password;

	private Date birth;

	private Integer sex;

	private String email;

	private Integer power;

	private Integer loginLockStatus;

	private Integer loginErrorCount;

	private Integer passwordStatus;

	private Timestamp passwordChangeDatetime;

	private Integer deleteFlag;

	private Timestamp updateDatetime;

	private Timestamp createDatetime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getLoginLockStatus() {
		return loginLockStatus;
	}

	public void setLoginLockStatus(Integer loginLockStatus) {
		this.loginLockStatus = loginLockStatus;
	}

	public Integer getLoginErrorCount() {
		return loginErrorCount;
	}

	public void setLoginErrorCount(Integer loginErrorCount) {
		this.loginErrorCount = loginErrorCount;
	}

	public Integer getPasswordStatus() {
		return passwordStatus;
	}

	public void setPasswordStatus(Integer passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	public Timestamp getPasswordChangeDatetime() {
		return passwordChangeDatetime;
	}

	public void setPasswordChangeDatetime(Timestamp passwordChangeDatetime) {
		this.passwordChangeDatetime = passwordChangeDatetime;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Timestamp getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public Timestamp getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Timestamp createDatetime) {
		this.createDatetime = createDatetime;
	}

}

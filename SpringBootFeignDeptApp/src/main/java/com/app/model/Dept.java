package com.app.model;

public class Dept {
	private Integer deptId;
	private String deptCode;
	public Dept() {
		super();
	}
	public Dept(Integer deptId, String deptCode) {
		super();
		this.deptId = deptId;
		this.deptCode = deptCode;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptCode=" + deptCode + "]";
	}
	
}

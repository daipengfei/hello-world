package com.hello.db.domain;

import java.util.Date;

/**
 * Created by daipengfei
 * on 2017/3/7.
 */


public class DbTest {

	private Integer code;

	private Date gmtModified;

	private Long id;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DbTest{" +
				"code=" + code +
				", gmtModified=" + gmtModified +
				", id=" + id +
				'}';
	}
}

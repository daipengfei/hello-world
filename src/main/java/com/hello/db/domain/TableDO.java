package com.hello.db.domain;

/**
 * Created by daipengfei
 * on 2017/3/7.
 */
public class TableDO {
	private Long id;

	private Integer code;

	private String val;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "TableDO{" +
				"id=" + id +
				", code=" + code +
				", val='" + val + '\'' +
				'}';
	}
}

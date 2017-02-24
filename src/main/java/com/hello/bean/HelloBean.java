package com.hello.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by daipengfei
 * on 2017/2/24.
 */

@Component
public class HelloBean {
	@Value("${hello.name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package com.hello;

import com.hello.bean.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created by daipengfei
 * on 2017/2/24.
 */
public class HelloWorld {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("/context-*.xml");
		HelloBean helloBean = context.getBean("helloBean", HelloBean.class);
		System.out.println(helloBean.getName());
		Properties sysConfig = context.getBean("sysConfig", Properties.class);
		System.out.println(sysConfig);
	}
}

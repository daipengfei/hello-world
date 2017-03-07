package com.hello;

import com.hello.bean.HelloBean;
import com.hello.db.domain.DbTest;
import com.hello.db.domain.TableDO;
import com.hello.db.mapper.DbTestMapper;
import com.hello.db.mapper.TableMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by daipengfei
 * on 2017/2/24.
 */
public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("/context-*.xml");
		HelloBean helloBean = context.getBean("helloBean", HelloBean.class);
		helloBean.updateById();
	}
}

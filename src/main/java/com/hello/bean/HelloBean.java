package com.hello.bean;

import com.hello.db.domain.DbTest;
import com.hello.db.domain.TableDO;
import com.hello.db.mapper.DbTestMapper;
import com.hello.db.mapper.TableMapper;
import com.hello.proxy.TestTransaction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by daipengfei
 * on 2017/2/24.
 */

@Component
public class HelloBean {
	@Value("${hello.name}")
	private String name;

	@Resource
	private DbTestMapper dbTestMapper;

	@Resource
	private TestTransaction testTransaction;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Transactional
	public boolean updateById() {
		TableDO tableDO = new TableDO();
		tableDO.setId(1L);
		tableDO.setVal("thank you");
		testTransaction.updateById(tableDO);
		if(1 ==1){
			throw new RuntimeException();
		}
		DbTest dbTest = new DbTest();
		dbTest.setId(1L);
		dbTestMapper.updateById(dbTest);
		return true;
	}

}

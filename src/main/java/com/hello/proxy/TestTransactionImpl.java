package com.hello.proxy;

import com.hello.db.domain.TableDO;
import com.hello.db.mapper.TableMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by daipengfei
 * on 2017/3/7.
 */

@Service
public class TestTransactionImpl implements TestTransaction {

	@Resource
	private TableMapper tableMapper;

	public int updateById(TableDO dbTest) {
		return tableMapper.updateById(dbTest);
	}

}

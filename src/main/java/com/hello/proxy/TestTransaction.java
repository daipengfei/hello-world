package com.hello.proxy;

import com.hello.db.domain.TableDO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by daipengfei
 * on 2017/3/7.
 */
public interface TestTransaction {

	int updateById(TableDO dbTest);

}

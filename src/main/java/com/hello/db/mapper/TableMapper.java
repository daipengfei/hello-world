package com.hello.db.mapper;

import com.hello.db.domain.TableDO;

/**
 * Created by daipengfei
 * on 2017/3/7.
 */

public interface TableMapper {

	TableDO queryById(Long id);

	int updateById(TableDO dbTest);
}

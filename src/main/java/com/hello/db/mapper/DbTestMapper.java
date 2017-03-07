package com.hello.db.mapper;

import com.hello.db.domain.DbTest;
import org.springframework.stereotype.Repository;

/**
 * Created by daipengfei
 * on 2017/3/7.
 */

public interface DbTestMapper {

	DbTest queryById(Long id);

	int updateById(DbTest dbTest);
}

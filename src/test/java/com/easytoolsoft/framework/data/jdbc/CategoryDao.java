package com.easytoolsoft.framework.data.jdbc;

import org.springframework.stereotype.Repository;

import com.easytoolsoft.framework.data.jdbc.BaseDao;

@Repository
public class CategoryDao extends BaseDao<CategoryPo> {
	public CategoryDao() {
		super(CategoryPo.TableName, CategoryPo.Id);
	}
}

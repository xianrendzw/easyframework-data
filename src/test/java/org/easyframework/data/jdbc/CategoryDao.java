package org.easyframework.data.jdbc;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao extends BaseDao<CategoryPo> {
	public CategoryDao() {
		super(CategoryPo.TableName, CategoryPo.Id);
	}
}

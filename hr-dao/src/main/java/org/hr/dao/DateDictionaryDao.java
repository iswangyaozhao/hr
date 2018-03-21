package org.hr.dao;

import java.util.List;

import org.hr.pojo.DateDictionary;

public interface DateDictionaryDao extends CommonDao<DateDictionary, Integer>{

	public List<DateDictionary> getTypeNameByType();
}

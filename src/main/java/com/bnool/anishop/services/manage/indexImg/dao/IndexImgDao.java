/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.bnool.anishop.services.manage.indexImg.dao;

import com.bnool.anishop.core.DaoManager;
import com.bnool.anishop.services.manage.indexImg.bean.IndexImg;

import java.util.List;


public interface IndexImgDao extends DaoManager<IndexImg> {

	/**
	 * @param i
	 * @return
	 */
	List<IndexImg> getImgsShowToIndex(int i);

}

/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.bnool.anishop.services.front.indexImg.impl;

import com.bnool.anishop.core.ServersManager;
import com.bnool.anishop.services.front.indexImg.IndexImgService;
import com.bnool.anishop.services.front.indexImg.bean.IndexImg;
import com.bnool.anishop.services.front.indexImg.dao.IndexImgDao;

import java.util.List;


/**
 * @author huangf
 */
public class IndexImgServiceImpl extends ServersManager<IndexImg> implements
		IndexImgService {

	private IndexImgDao indexImgDao;

	public IndexImgDao getIndexImgDao() {
		return indexImgDao;
	}

	public void setIndexImgDao(IndexImgDao indexImgDao) {
		this.indexImgDao = indexImgDao;
	}

	@Override
	public List<IndexImg> getImgsShowToIndex(int i) {
		return indexImgDao.getImgsShowToIndex(i);
	}

}

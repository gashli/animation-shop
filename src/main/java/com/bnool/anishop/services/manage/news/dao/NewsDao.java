/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.bnool.anishop.services.manage.news.dao;

import com.bnool.anishop.core.DaoManager;
import com.bnool.anishop.services.manage.news.bean.News;

import java.util.List;


/**
 * @author huangf
 * @param <T>
 */
public interface NewsDao extends DaoManager<News> {

	/**
	 * @param e
	 * @return
	 */
	List<News> selecIndexNews(News e);

	/**
	 * @param news
	 */
	void sync(News news);

	void updateDownOrUp(News news);

	int selectCount(News news);

}

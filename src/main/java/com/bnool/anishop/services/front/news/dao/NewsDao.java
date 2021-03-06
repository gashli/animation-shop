/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.bnool.anishop.services.front.news.dao;

import com.bnool.anishop.core.DaoManager;
import com.bnool.anishop.services.front.news.bean.News;

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
	 * @return
	 */
	List<String> selectAllMd5();

	/**
	 * @param e
	 */
	void updateInBlackList(String e);

	/**
	 * @param news
	 */
	void sync(News news);

	List<News> selectNoticeList(News news);

	News selectSimpleOne(News news);

}

package com.bnool.anishop.services.manage.advert.dao.impl;import com.bnool.anishop.core.dao.BaseDao;import com.bnool.anishop.core.dao.page.PagerModel;import com.bnool.anishop.services.manage.advert.bean.Advert;import com.bnool.anishop.services.manage.advert.dao.AdvertDao;import java.util.List;public class AdvertDaoImpl implements AdvertDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Advert e) {		return dao.selectPageList("manage.advert.selectPageList",				"manage.advert.selectPageCount", e);	}	public List selectList(Advert e) {		return dao.selectList("manage.advert.selectList", e);	}	public Advert selectOne(Advert e) {		return (Advert) dao.selectOne("manage.advert.selectOne", e);	}	public int delete(Advert e) {		return dao.delete("manage.advert.delete", e);	}	public int update(Advert e) {		return dao.update("manage.advert.update", e);	}	public int deletes(String[] ids) {		Advert e = new Advert();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Advert e) {		return dao.insert("manage.advert.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.advert.deleteById", id);	}	@Override	public Advert selectById(String id) {		return (Advert) dao.selectOne("manage.advert.selectById", id);	}}
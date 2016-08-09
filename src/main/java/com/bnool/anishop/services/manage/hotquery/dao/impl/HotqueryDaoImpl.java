package com.bnool.anishop.services.manage.hotquery.dao.impl;import com.bnool.anishop.core.dao.BaseDao;import com.bnool.anishop.core.dao.page.PagerModel;import com.bnool.anishop.services.manage.hotquery.bean.Hotquery;import com.bnool.anishop.services.manage.hotquery.dao.HotqueryDao;import java.util.List;public class HotqueryDaoImpl implements HotqueryDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Hotquery e) {		return dao.selectPageList("manage.hotquery.selectPageList",				"manage.hotquery.selectPageCount", e);	}	public List selectList(Hotquery e) {		return dao.selectList("manage.hotquery.selectList", e);	}	public Hotquery selectOne(Hotquery e) {		return (Hotquery) dao.selectOne("manage.hotquery.selectOne", e);	}	public int delete(Hotquery e) {		return dao.delete("manage.hotquery.delete", e);	}	public int update(Hotquery e) {		return dao.update("manage.hotquery.update", e);	}	public int deletes(String[] ids) {		Hotquery e = new Hotquery();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Hotquery e) {		return dao.insert("manage.hotquery.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.hotquery.deleteById", id);	}	@Override	public Hotquery selectById(String id) {		return null;	}}
package com.bnool.anishop.services.manage.spec.dao.impl;import com.bnool.anishop.core.dao.BaseDao;import com.bnool.anishop.core.dao.page.PagerModel;import com.bnool.anishop.services.manage.spec.bean.Spec;import com.bnool.anishop.services.manage.spec.dao.SpecDao;import java.util.List;public class SpecDaoImpl implements SpecDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Spec e) {		return dao.selectPageList("manage.spec.selectPageList",				"manage.spec.selectPageCount", e);	}	public List selectList(Spec e) {		return dao.selectList("manage.spec.selectList", e);	}	public Spec selectOne(Spec e) {		return (Spec) dao.selectOne("manage.spec.selectOne", e);	}	public int delete(Spec e) {		return dao.delete("manage.spec.delete", e);	}	public int update(Spec e) {		return dao.update("manage.spec.update", e);	}	public int deletes(String[] ids) {		Spec e = new Spec();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Spec e) {		return dao.insert("manage.spec.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.spec.deleteById", id);	}	@Override	public Spec selectById(String id) {		return (Spec) dao.selectOne("manage.spec.selectById", id);	}}
package com.bnool.anishop.services.manage.area.dao;import com.bnool.anishop.core.DaoManager;import com.bnool.anishop.services.manage.area.bean.Area;import java.util.List;public interface AreaDao extends DaoManager<Area> {	void deleteAll();	List<Area> selectListByPcode(String pcode);	int getCount(Area area);}
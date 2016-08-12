package com.bnool.anishop.core.dao;

import com.bnool.anishop.core.dao.page.PagerModel;
import com.bnool.anishop.core.exception.PrivilegeException;
import org.apache.ibatis.exceptions.IbatisException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


/**
 * 封装mybatis最基本的数据库操作
 * @author huangf
 *
 */
public class BaseDao extends SqlSessionDaoSupport {

	protected static final org.slf4j.Logger log = LoggerFactory.getLogger(BaseDao.class);
	
	private static final boolean selectPrivilege = false;

	protected SqlSession sqlSession;

	protected boolean externalSqlSession = true;
	
	@Autowired(required = false)
	@Qualifier("sessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		if (!externalSqlSession) {
			this.sqlSession = new SqlSessionTemplate(sqlSessionFactory);
		}
	}

	/**
	 * 查询一条记录
	 * 
	 * @param arg0
	 * @return
	 */
	public Object selectOne(String arg0) {
		return sqlSession.selectOne(arg0);
	}

	/**
	 * 查询一条记录
	 * 
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public Object selectOne(String arg0, Object arg1) {
		return sqlSession.selectOne(arg0, arg1);
	}

	/**
	 * 分页查询
	 * 
	 * @param selectList
	 * @param selectCount
	 * @param param
	 * @return
	 */
	public PagerModel selectPageList(String selectList, String selectCount,
			Object param) {
		List list = sqlSession.selectList(selectList, param);
		PagerModel pm = new PagerModel();
		pm.setList(list);
		Object oneC = sqlSession.selectOne(selectCount, param);
		if(oneC!=null){
			pm.setTotal(Integer.parseInt(oneC.toString()));
		}else{
			pm.setTotal(0);
		}
		
		return pm;
	}

	/**
	 * 查询多条记录
	 * 
	 * @param arg0
	 * @return
	 */
	public List selectList(String arg0) {
		return sqlSession.selectList(arg0);
	}

	/**
	 * 查询多条记录
	 * 
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public List selectList(String arg0, Object arg1) {
		
		return sqlSession.selectList(arg0, arg1);
	}

	/**
	 * 查询总数
	 * 
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public int getCount(String arg0, Object arg1) {
		
		return (Integer) sqlSession.selectOne(arg0, arg1);
	}

	/**
	 * 插入一条记录
	 * 
	 * @param arg0
	 * @return
	 */
	public int insert(String arg0) {
		if(selectPrivilege){
			throw new PrivilegeException("只具备查询的权限！");
		}
		return sqlSession.insert(arg0);
	}

	/**
	 * 插入一条记录，成功则返回插入的ID；失败则抛出异常
	 * 
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public int insert(String arg0, Object arg1) {
		if(selectPrivilege){
			throw new PrivilegeException("只具备查询的权限！");
		}
		int row = sqlSession.insert(arg0, arg1);
		if(row==1){
			return Integer.valueOf(((PagerModel)arg1).getId());
		}
		throw new IbatisException();
	}

	/**
	 * 更新一条记录
	 * 
	 * @param arg0
	 * @return
	 */
	public int update(String arg0) {
		if(selectPrivilege){
			throw new PrivilegeException("只具备查询的权限！");
		}
		return sqlSession.update(arg0);
	}

	/**
	 * 更新一条记录
	 * 
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public int update(String arg0, Object arg1) {
		if(selectPrivilege){
			throw new PrivilegeException("只具备查询的权限！");
		}
		int row = sqlSession.update(arg0, arg1);
		if(row==1){
			if(arg1 instanceof PagerModel){
//				return Integer.valueOf(((PagerModel)arg1).getId());
				String obj = ((PagerModel)arg1).getId();
				if(obj==null){
					return 0;
				}
				return Integer.valueOf(obj);
			}
		}
		return 1;
	}

	/**
	 * 删除一条记录
	 * 
	 * @param arg0
	 * @return
	 */
	public int delete(String arg0) {
		if(selectPrivilege){
			throw new PrivilegeException("只具备查询的权限！");
		}
		return sqlSession.delete(arg0);
	}

	/**
	 * 删除一条记录
	 * 
	 * @param arg0
	 * @param arg1
	 * @return
	 */
	public int delete(String arg0, Object arg1) {
		if(selectPrivilege){
			throw new PrivilegeException("只具备查询的权限！");
		}
		return sqlSession.delete(arg0, arg1);
	}

}

package net.gondor.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import net.gondor.dao.BoardDao;
import net.gondor.vo.EmployeesVO;

public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	@Override
	public String getNowDate() {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("indexDao.getNowDate");
	}

	@Override
	public List<EmployeesVO> getAllEmployee() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("boardDao.getAllEmployee");
	}

}

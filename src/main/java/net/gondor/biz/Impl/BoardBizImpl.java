package net.gondor.biz.Impl;

import java.util.List;

import net.gondor.biz.BoardBiz;
import net.gondor.dao.BoardDao;
import net.gondor.vo.EmployeesVO;

public class BoardBizImpl implements BoardBiz{
	BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}



	@Override
	public String getNowDate() {
		// TODO Auto-generated method stub
		return boardDao.getNowDate();
	}



	@Override
	public List<EmployeesVO> getAllEmployee() {
		// TODO Auto-generated method stub
		return boardDao.getAllEmployee();
	}

}

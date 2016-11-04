package net.gondor.service.impl;

import java.util.List;

import net.gondor.biz.BoardBiz;
import net.gondor.service.BoardService;
import net.gondor.vo.EmployeesVO;

public class BoardServiceImpl implements BoardService{
	BoardBiz boardBiz;
	
	public void setBoardBiz(BoardBiz boardBiz) {
		this.boardBiz = boardBiz;
	}

	@Override
	public String getNowDate() {
		return boardBiz.getNowDate();
	}

	@Override
	public List<EmployeesVO> getAllEmployee() {
		// TODO Auto-generated method stub
		return boardBiz.getAllEmployee();
	}

}

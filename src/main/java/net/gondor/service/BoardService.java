package net.gondor.service;

import java.util.List;

import net.gondor.vo.EmployeesVO;

public interface BoardService {
	public String getNowDate();

	public List<EmployeesVO> getAllEmployee();
}

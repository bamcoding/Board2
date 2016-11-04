package net.gondor.dao;

import java.util.List;

import net.gondor.vo.EmployeesVO;

public interface BoardDao {
	
	public String getNowDate();

	public List<EmployeesVO> getAllEmployee();
	
}

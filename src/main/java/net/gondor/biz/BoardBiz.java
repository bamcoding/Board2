package net.gondor.biz;

import java.util.List;

import net.gondor.vo.EmployeesVO;

public interface BoardBiz {
	public String getNowDate();

	public List<EmployeesVO> getAllEmployee();
}

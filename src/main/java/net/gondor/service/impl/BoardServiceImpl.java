package net.gondor.service.impl;

import java.util.List;

import net.gondor.biz.BoardBiz;
import net.gondor.service.BoardService;
import net.gondor.vo.DepartmentsVO;
import net.gondor.vo.EmployeesVO;
import net.gondor.vo.JobVO;

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

	@Override
	public List<DepartmentsVO> getAllDepartment() {
		// TODO Auto-generated method stub
		return boardBiz.getAllDepartment();
	}

	@Override
	public boolean addNewEmployee(EmployeesVO employeesVO) {
		// TODO Auto-generated method stub
		return boardBiz.addNewEmployee(employeesVO);
	}

	@Override
	public boolean removeEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return boardBiz.removeEmployee(employeeId);
	}

	@Override
	public boolean promotionEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return boardBiz.promotionEmployee(employeeId);
	}

	@Override
	public boolean addNewDepartment(DepartmentsVO departmentsVO) {
		// TODO Auto-generated method stub
		return boardBiz.addNewDepartment(departmentsVO);
	}

	@Override
	public boolean removeDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return boardBiz.removeDepartment(departmentId);
	}

	@Override
	public boolean changeDepartment(String departmentId, String employeeId) {
		// TODO Auto-generated method stub
		return boardBiz.changeDepartment(departmentId, employeeId);
	}

	@Override
	public List<JobVO> getAllJob() {
		// TODO Auto-generated method stub
		return boardBiz.getAllJob();
	}

	@Override
	public boolean changeJob(String jobId, String employeeId) {
		// TODO Auto-generated method stub
		return boardBiz.changeJob(jobId, employeeId);
	}

}

package net.gondor.biz.Impl;

import java.util.List;

import net.gondor.biz.BoardBiz;
import net.gondor.dao.BoardDao;
import net.gondor.vo.DepartmentsVO;
import net.gondor.vo.EmployeesVO;
import net.gondor.vo.JobVO;

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



	public List<DepartmentsVO> getAllDepartment() {
		// TODO Auto-generated method stub
		return boardDao.getAllDepartment();
	}



	@Override
	public boolean addNewEmployee(EmployeesVO employeesVO) {
		// TODO Auto-generated method stub
		return boardDao.addNewEmployee(employeesVO)>0;
	}



	@Override
	public boolean removeEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return boardDao.removeEmployee(employeeId)>0;
	}



	@Override
	public boolean promotionEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return boardDao.promotionEmployee(employeeId)>0;
	}



	@Override
	public boolean addNewDepartment(DepartmentsVO departmentsVO) {
		// TODO Auto-generated method stub
		return boardDao.addNewDepartment(departmentsVO)>0;
	}



	@Override
	public boolean removeDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return boardDao.removeDepartment(departmentId)>0;
	}



	@Override
	public boolean changeDepartment(String departmentId, String employeeId) {
		// TODO Auto-generated method stub
		return boardDao.changeDepartment(departmentId, employeeId)>0;
	}



	@Override
	public List<JobVO> getAllJob() {
		// TODO Auto-generated method stub
		return boardDao.getAllJob();
	}



	@Override
	public boolean changeJob(String jobId, String employeeId) {
		// TODO Auto-generated method stub
		return boardDao.changeJob(jobId, employeeId)>0;
	}

}

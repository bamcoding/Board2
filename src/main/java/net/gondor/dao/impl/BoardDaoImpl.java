package net.gondor.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import net.gondor.dao.BoardDao;
import net.gondor.vo.DepartmentsVO;
import net.gondor.vo.EmployeesVO;
import net.gondor.vo.JobVO;

public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao{

	@Override
	public String getNowDate() {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("boardDao.getNowDate");
	}

	@Override
	public List<EmployeesVO> getAllEmployee() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("boardDao.getAllEmployee");
	}

	@Override
	public List<DepartmentsVO> getAllDepartment() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("boardDao.getAllDepartment");
	}

	@Override
	public int addNewEmployee(EmployeesVO employeesVO) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("boardDao.addNewEmployee", employeesVO);
	}

	@Override
	public int removeEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("boardDao.removeEmployee", employeeId);
	}

	@Override
	public int promotionEmployee(String employeeId) {
		// TODO Auto-generated method stub
		return getSqlSession().update("boardDao.promotionEmployee", employeeId);
	}

	@Override
	public int addNewDepartment(DepartmentsVO departmentsVO) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("boardDao.addNewDepartment", departmentsVO);
	}

	@Override
	public int removeDepartment(String departmentId) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("boardDao.removeDepartment", departmentId);
	}

	@Override
	public int changeDepartment(String departmentId, String employeeId) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("departmentId", departmentId);
		map.put("employeeId", employeeId);
		return getSqlSession().update("boardDao.changeDepartment", map);
	}

	@Override
	public List<JobVO> getAllJob() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("boardDao.getAllJob");
	}

	@Override
	public int changeJob(String jobId, String employeeId) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("jobId", jobId);
		map.put("employeeId", employeeId);
		return getSqlSession().update("boardDao.changeJob", map);
	}

}

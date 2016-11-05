package net.gondor.dao;

import java.util.List;

import net.gondor.vo.DepartmentsVO;
import net.gondor.vo.EmployeesVO;
import net.gondor.vo.JobVO;

public interface BoardDao {
	
	public String getNowDate();

	public List<EmployeesVO> getAllEmployee();

	public List<DepartmentsVO> getAllDepartment();

	public int addNewEmployee(EmployeesVO employeesVO);

	public int removeEmployee(String employeeId);

	public int promotionEmployee(String employeeId);

	public int addNewDepartment(DepartmentsVO departmentsVO);

	public int removeDepartment(String departmentId);

	public int changeDepartment(String departmentId, String employeeId);

	public List<JobVO> getAllJob();

	public int changeJob(String jobId, String employeeId);
	
}

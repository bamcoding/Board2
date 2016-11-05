package net.gondor.service;

import java.util.List;

import net.gondor.vo.DepartmentsVO;
import net.gondor.vo.EmployeesVO;
import net.gondor.vo.JobVO;

public interface BoardService {
	public String getNowDate();

	public List<EmployeesVO> getAllEmployee();

	public List<DepartmentsVO> getAllDepartment();

	public boolean addNewEmployee(EmployeesVO employeesVO);

	public boolean removeEmployee(String employeeId);

	public boolean promotionEmployee(String employeeId);

	public boolean addNewDepartment(DepartmentsVO departmentsVO);

	public boolean removeDepartment(String departmentId);

	public boolean changeDepartment(String departmentId, String employeeId);

	public List<JobVO> getAllJob();

	public boolean changeJob(String jobId, String employeeId);
}

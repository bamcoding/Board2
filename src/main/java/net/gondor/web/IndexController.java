package net.gondor.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.gondor.service.BoardService;
import net.gondor.vo.DepartmentsVO;
import net.gondor.vo.EmployeesVO;
import net.gondor.vo.JobVO;

@Controller
public class IndexController {
	BoardService boardService;
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}

	@RequestMapping("/")
	public ModelAndView viewIndexPage(){
		String date = boardService.getNowDate();
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		view.addObject("date",date);
		return view;
	}
	
	@RequestMapping("/employeeList")
	public ModelAndView viewEmployeeListPage(){
		List<EmployeesVO> employeeList = boardService.getAllEmployee();
		ModelAndView view = new ModelAndView();
		view.setViewName("employeeList");
		view.addObject("employeeList",employeeList);
		return view;
	}
	@RequestMapping("/addEmployee")
	public String viewAddEmployeePage(){
		return "addEmployee";
	}
	@RequestMapping("/doAddEmployee")
	public ModelAndView doAddEmployeePage(EmployeesVO employeesVO){
		
		boolean isSuccess = boardService.addNewEmployee(employeesVO);
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:employeeList");
		return view;
	}
	@RequestMapping("/doRemoveEmployee")
	public ModelAndView doRemoveEmployeePage(@RequestParam String[] checkBox){
		for(int i=0; i<checkBox.length; i++){
			boardService.removeEmployee(checkBox[i]);
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:employeeList");
		return view;
	}
	@RequestMapping("/doPromotionEmployee")
	public ModelAndView doPromotionPage(@RequestParam String[] checkBox){
		for(int i=0; i<checkBox.length; i++){
			boardService.promotionEmployee(checkBox[i]);
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:employeeList");
		return view;
	}

	
	//부서 -------------------------
	
	@RequestMapping("/departmentList")
	public ModelAndView viewDepartmentListPage(@RequestParam(required=false, defaultValue="0") String employeeId){
		List<DepartmentsVO> departmentList = boardService.getAllDepartment();
		ModelAndView view = new ModelAndView();
		view.setViewName("departmentList");
		view.addObject("departmentList",departmentList);
		view.addObject("employeeId", employeeId);
		return view;
	}
	@RequestMapping("/addDepartment")
	public String viewAddDepartmentPage(){
		return "addDepartment";
	}
	@RequestMapping("/doAddDepartment")
	public ModelAndView doAddDepartmentPage(DepartmentsVO departmentsVO){
		
		boolean isSuccess = boardService.addNewDepartment(departmentsVO);
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:departmentList");
		return view;
	}
	@RequestMapping("/doRemoveDepartment")
	public ModelAndView doRemoveDepartmentPage(@RequestParam String[] checkBox){
		for(int i=0; i<checkBox.length; i++){
			boardService.removeDepartment(checkBox[i]);
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:departmentList");
		return view;
	}
	
	@RequestMapping("/doChangeDepartment")
	public ModelAndView doChangeDepartment(@RequestParam String[] checkBox, String employeeId){
		for(int i=0; i<checkBox.length; i++){
			boardService.changeDepartment(checkBox[i], employeeId);
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:employeeList");
		return view;
	}
	
	
	// 직무--------------
	@RequestMapping("/jobList")
	public ModelAndView viewJobListPage(@RequestParam(required=false, defaultValue="0") String employeeId){
		ModelAndView view = new ModelAndView();
		List<JobVO> jobList = boardService.getAllJob();
		view.setViewName("jobList");

		view.addObject("jobList", jobList);
		
		view.addObject("employeeId", employeeId);
		return view;
	}
	@RequestMapping("/doChangeJob")
	public ModelAndView doChangeJob(@RequestParam String[] checkBox, String employeeId){
		for(int i=0; i<checkBox.length; i++){
			boardService.changeJob(checkBox[i], employeeId);
		}
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:employeeList");
		return view;
	}
}

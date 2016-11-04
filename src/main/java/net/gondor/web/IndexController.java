package net.gondor.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.gondor.service.BoardService;
import net.gondor.vo.EmployeesVO;

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
	public ModelAndView viewListPage(){
		List<EmployeesVO> employeeList = boardService.getAllEmployee();
		ModelAndView view = new ModelAndView();
		view.setViewName("employeeList");
		view.addObject("employeeList",employeeList);
		return view;
	}
}

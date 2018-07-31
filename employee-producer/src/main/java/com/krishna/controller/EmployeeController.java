package com.krishna.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.model.Employee;

@RestController
//This will allow us to reinitialize this controller to get any new config
//values when the /refresh endpoint is POSTed to.
@RefreshScope
public class EmployeeController {
	
	@Value("${info.designation}")
    private String designation;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation(designation);
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

}

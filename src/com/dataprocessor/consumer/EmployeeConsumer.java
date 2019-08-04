package com.dataprocessor.consumer;

import com.dataprocessor.service.EmployeeService;
import com.dataprocessor.service.EmployeeServiceImpl;

public class EmployeeConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.getListOfEmployees();
	}

}

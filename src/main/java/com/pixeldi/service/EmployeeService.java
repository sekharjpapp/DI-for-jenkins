package com.pixeldi.service;

import com.pixeldi.audit.InputRequest;
import com.pixeldi.model.Employee;
import com.pixeldi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveEmployee(InputRequest<Employee> request){
        String currentUser =  request.getLoggedInUser();
        request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());

        Employee employee = request.getEmployee();
        employee.setCreatedBy(currentUser);
        employeeRepository.save(employee);
        return "Employee Saved successfully";
    }

}

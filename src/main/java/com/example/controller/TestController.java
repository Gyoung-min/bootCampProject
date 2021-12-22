package com.example.controller;



import com.example.dto.EmployeeDto;
import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.sql.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Date;

@Controller
public class TestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value="/")
    public String test(Model model) {
        /*List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);*/

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setEmployeeId("rudals0326");
        employeeDto.setEmployeeTel("010-9159-6922");
        employeeDto.setEmployeePassword("rudals12@!");
        //employeeDto.setOpen_date(LocalDateTime.MAX);
        employeeDto.setEmployeeName("노경민");
        model.addAttribute("employeeDto", employeeDto);

        return "testPage";
    }
}

package com.example.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
public class EmployeeDto {

    private String employeeId;

    private String employeeName;

    private String employeePassword;

    private String employeeTel;

    private String storeLocation;

    private String storeName;

    private LocalDateTime open_date;
}

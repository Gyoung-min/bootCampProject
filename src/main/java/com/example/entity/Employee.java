package com.example.entity;

import lombok.Data;


import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Employee {

    @Id
    private String employeeId;

    @Column(name="employee_name", nullable = false)
    private String employeeName; //nullable

    @Column(name="employee_password", nullable = false)
    private String employeePassword; //nullable

    @Column(name="employee_tel", nullable = false, unique = true)
    private String employeeTel; //nullable

    @Column(name="store_location", unique = true)
    private String storeLocation;

    @Column(name="store_name", unique = true)
    private String storeName;

    private LocalDateTime open_date;
}
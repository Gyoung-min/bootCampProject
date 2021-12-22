package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Sales {

    @Id
    private String storeName;

    @Column(name="store_employee_id", unique = true)
    private String storeEmployeeId;

    @Column(name="store_total_sales", nullable = false)
    private Long storeTotalSales;//nullable

    @Column(name="sales", nullable = false)
    private Long sales;//nullable

    @Column(name="date", nullable = false)
    private LocalDateTime date;//nullable

}

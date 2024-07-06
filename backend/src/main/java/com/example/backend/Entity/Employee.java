package com.example.backend.Entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Data
public class Employee {
    private Integer employeeId;
    private Integer labelId;
    private String employeeName;
    private String employeePosition;
    private String employeeStatus;
    private String employeePhone;
    @DateTimeFormat(pattern = "yyyy-MMMM-dd")
    private Date employeeWorkdate;
}

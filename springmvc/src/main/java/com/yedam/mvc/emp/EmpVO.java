package com.yedam.mvc.emp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	private String employee_id;
	private String first_name;
	private String last_name;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hire_date;
	private String job_id;
	private String salary;
}

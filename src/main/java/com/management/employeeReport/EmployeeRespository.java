package com.management.employeeReport;
import com.management.employeeModel.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository <Employee,Long> {

}

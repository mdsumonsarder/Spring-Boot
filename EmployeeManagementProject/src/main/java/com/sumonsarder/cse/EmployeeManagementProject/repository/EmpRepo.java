package com.sumonsarder.cse.EmployeeManagementProject.repository;

import com.sumonsarder.cse.EmployeeManagementProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer> {

}

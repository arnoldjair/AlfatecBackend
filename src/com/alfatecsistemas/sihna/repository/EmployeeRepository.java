package com.alfatecsistemas.sihna.repository;

import org.springframework.data.repository.CrudRepository;

import com.alfatecsistemas.sihna.bean.Employee;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends CrudRepository<Employee, Long>,
        JpaSpecificationExecutor<Employee> {
}

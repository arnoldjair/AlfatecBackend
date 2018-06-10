package com.alfatecsistemas.sihna.service;

import java.util.List;
import com.alfatecsistemas.sihna.bean.Employee;

public interface IEmployeeService {

    public Employee create(Employee employee);

    public Employee get(Long employeeId);

    public Employee byIdAndDeptId(Long employeeId, Long deptId);

    public boolean deleteByIdAndDeptId(Long employeeId, Long deptId);

    public List<Employee> byDept(Long deptId);

    public Employee update(Employee employee, Long employeeId);

    public void delete(Long employeeId);

    public List<Employee> list();
}

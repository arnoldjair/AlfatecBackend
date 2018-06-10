package com.alfatecsistemas.sihna.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfatecsistemas.sihna.bean.Department;
import com.alfatecsistemas.sihna.bean.Employee;
import com.alfatecsistemas.sihna.repository.DepartmentRepository;
import com.alfatecsistemas.sihna.repository.DepartmentSpec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department get(Long departmentId) {
        return departmentRepository.findOne(departmentId);
    }

    @Override
    public Department byName(String name) {
        Specification<Department> spec;
        spec = Specifications.where(DepartmentSpec.byName(name));
        List<Department> departments = this.departmentRepository.findAll(spec);

        if (departments != null && !departments.isEmpty()) {
            return departments.get(0);
        }

        return null;
    }

    @Override
    public Department update(Department department, Long departmentId) {
        return departmentRepository.save(department);
    }

    @Override
    public void delete(Long departmentId) {
        departmentRepository.delete(departmentId);
    }

    @Override
    public List<Department> list() {
        return (List<Department>) departmentRepository.findAll();
    }

    @Override
    public List<Employee> getEmployeesByDeptName(String name) {
        Department department = this.byName(name);
        if (department != null) {
            return null;
        } else {
            return null;
        }
    }

}

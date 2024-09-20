package com.example.task.services;


import com.example.task.entities.Department;
import com.example.task.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public int registration(Department department){
         Department dep =  departmentRepository.save(department);
        return  dep.getIndex();
    }
}

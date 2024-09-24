package com.example.botscrewtask.service;

import com.example.botscrewtask.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.botscrewtask.constants.StringConstants.*;
import static com.example.botscrewtask.enums.Degree.*;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<String> findAllDepartmentsName() {
        return this.departmentRepository.findAllDepartmentsName();
    }

    public String getHeadOfDepartment(String departmentName) {
        return String.format(HEAD_OF_DEPARTMENT_FORMAT, departmentName, this.departmentRepository.findDepartmentHeadByDepartmentName(departmentName));
    }

    public String getDepartmentStatistics(String departmentName) {
        var longMap = this.departmentRepository.aggregateStatisticByDepartmentName(departmentName);
        return String.format(DEPARTMENT_STATISTIC_FORMAT,
                longMap.putIfAbsent(ASSISTANT.name(), 0L),
                longMap.putIfAbsent(ASSOCIATE_PROFESSOR.name(), 0L),
                longMap.putIfAbsent(PROFESSOR.name(), 0L)
        );
    }

    public String getAverageSalary(String departmentName) {
        return String.format(AVERAGE_SALARY_FORMAT, departmentName, this.departmentRepository.findAvgSalaryByDepartmentName(departmentName));
    }

    public String getEmployeeCount(String departmentName) {
        return String.format(EMPLOYEE_COUNT_FORMAT, this.departmentRepository.findCountLectorsByDepartmentName(departmentName));
    }
}

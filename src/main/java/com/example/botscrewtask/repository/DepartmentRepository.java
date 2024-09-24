package com.example.botscrewtask.repository;

import com.example.botscrewtask.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query(value = "SELECT name FROM department", nativeQuery = true)
    List<String> findAllDepartmentsName();

    @Query(value = "SELECT l.name FROM department d JOIN lector l ON l.id = d.head_id WHERE d.name = :departmentName", nativeQuery = true)
    String findDepartmentHeadByDepartmentName(@Param("departmentName") String departmentName);

    @Query(value = "SELECT AVG(l.salary) FROM department d JOIN department_lectors dl ON d.id = dl.departments_id JOIN lector l ON l.id = dl.lectors_id WHERE d.name = :departmentName", nativeQuery = true)
    BigDecimal findAvgSalaryByDepartmentName(@Param("departmentName") String departmentName);

    @Query(value = "SELECT " +
            "SUM(CASE WHEN l.degree = 'ASSISTANT' THEN 1 ELSE 0 END) AS 'ASSISTANT', " +
            "SUM(CASE WHEN l.degree = 'ASSOCIATE_PROFESSOR' THEN 1 ELSE 0 END) AS 'ASSOCIATE_PROFESSOR', " +
            "SUM(CASE WHEN l.degree = 'PROFESSOR' THEN 1 ELSE 0 END) AS 'PROFESSOR' " +
            "FROM department d " +
            "JOIN department_lectors dl ON d.id = dl.departments_id " +
            "JOIN lector l ON l.id = dl.lectors_id WHERE d.name = :departmentName", nativeQuery = true)
    Map<String, Long> aggregateStatisticByDepartmentName(@Param("departmentName") String departmentName);

    @Query(value = "SELECT COUNT(*) FROM department d JOIN department_lectors dl ON d.id = dl.departments_id JOIN lector l ON l.id = dl.lectors_id WHERE d.name = :departmentName", nativeQuery = true)
    long findCountLectorsByDepartmentName(@Param("departmentName") String departmentName);
}

package com.edgv.backend.empleado_serve.Repository;

import com.edgv.backend.empleado_serve.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}

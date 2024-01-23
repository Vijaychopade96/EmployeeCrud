package com.example.SimpleCrud.Repository;

import com.example.SimpleCrud.Model.Employee;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {



}

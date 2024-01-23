package com.example.SimpleCrud.Service;

import com.example.SimpleCrud.Model.Employee;
import com.example.SimpleCrud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> showEmployee() {
        return employeeRepository.findAll();
    }

    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "delete employee successfully";
    }


    public Employee updateEmployee(int employeeId, String name, String email) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);

        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();
            existingEmployee.setName(name);
            existingEmployee.setEmail(email);

            return employeeRepository.save(existingEmployee);
        } else {
            throw new EntityNotFoundException("Employee with ID " + employeeId + " not found");
        }


    }
}
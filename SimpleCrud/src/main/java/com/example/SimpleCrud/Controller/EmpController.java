package com.example.SimpleCrud.Controller;

import com.example.SimpleCrud.Model.Employee;
import com.example.SimpleCrud.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.metamodel.SingularAttribute;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee( @RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/show")
    public List<Employee>showEmployee(){
        return employeeService.showEmployee();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
       return employeeService.deleteEmployee(id);
    }





    @PutMapping("/update/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable int employeeId,
            @RequestParam String name,
            @RequestParam String email
    ) {
        Employee updatedEmployee = employeeService.updateEmployee(( employeeId), name, email);
        return ResponseEntity.ok(updatedEmployee);
    }

}
//http://localhost:8989/update/1?newName=datta&newEmail=datta@gmail.com
package com.example.SimpleCrud.Model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@Entity
@Table(name = "Employee")


public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;


    private  String email;

    public Employee(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
    }


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

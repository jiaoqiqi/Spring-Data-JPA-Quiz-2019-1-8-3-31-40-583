package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Company")
public class Company {

  @Id
  @GeneratedValue
  private int id;
  private String companyName;
  private int employeesNumber;

  public Company() {
  }

  public Company(int id, String companyName, int employeesNumber) {
    this.id = id;
    this.companyName = companyName;
    this.employeesNumber = employeesNumber;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public int getEmployeesNumber() {
    return employeesNumber;
  }

  public void setEmployeesNumber(int employeesNumber) {
    this.employeesNumber = employeesNumber;
  }
}

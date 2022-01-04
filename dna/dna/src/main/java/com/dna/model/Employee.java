package com.dna.model;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eId;
    @Column(name="eName")
    private String eName;
    @Column(name="salary")
    private Double salary;

    public Employee() {
        super();
    }

    public Employee(int eId, String eName, Double salary) {
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }

    public Employee(String eName, Double salary) {
        this.eName = eName;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

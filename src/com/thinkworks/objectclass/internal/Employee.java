package com.thinkworks.objectclass.internal;

public class Employee {
    private int empId;
    private String name;
    private double salary;
    private String department;
    private int experience;

    public Employee(int empId, String name, double salary, String department, int experience) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.experience = experience;
    }


    @Override
    public String toString(){
        return "ID : "+empId+", Name : "+name+", Salary : "
                +salary+", Department : "+department+", Experience : "+experience;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee){
            Employee employee=(Employee) obj;
            if(this.empId==employee.getEmpId()){
                if(this.name.equals(employee.getName())){
                    if(this.department.equals(employee.getDepartment())){
                        if(this.salary==employee.getSalary()){
                            if(this.experience==employee.getExperience()){
                                return true;
                            }
                        } return false;
                    } return false;
                } return false;
            }return false;
        }
        else return false;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

package com.stream.practice;

import java.time.LocalDate;
import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private int empAge;
	private Double empSalary;
	private String department;
	private String city;
	private String gender;
	private LocalDate joiningDate;
	private List<String> skills;

	public Employee(int empId, String empName, int empAge, Double empSalary, String department, 
			String city, String gender, LocalDate joiningDate, List<String> skills) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.department = department;
		this.city = city;
		this.gender = gender;
		this.joiningDate = joiningDate;
		this.skills = skills;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public String getDepartment() {
		return department;
	}

	public String getCity() {
		return city;
	}

	public String getGender() {
		return gender;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public List<String> getSkills() {
		return skills;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"empId=" + empId +
				", empName='" + empName + '\'' +
				", empAge=" + empAge +
				", empSalary=" + empSalary +
				", department='" + department + '\'' +
				", city='" + city + '\'' +
				", gender='" + gender + '\'' +
				", joiningDate=" + joiningDate +
				", skills=" + skills +
				'}';
	}

}

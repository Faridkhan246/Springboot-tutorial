package com.example.springboot_tutorial.student;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(name = "student_sequence",
	                     sequenceName="student_sequence",
	                     allocationSize=1)
	                     
	@GeneratedValue(strategy=GenerationType.SEQUENCE,
	                  generator="student_sequence")
	 @JsonProperty("id")
	private Long id;
	 
	 @JsonProperty("name")
	private String name;
	 
	 @JsonProperty("email")
	private String email;
	 
	 @JsonProperty("dob")
	    @JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	 
	 @JsonProperty("age")
	private Integer age;

	
	public Student() {
		
	}


	public Student(Long id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}


	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}


	public String getEmail() {
		return email;
	}


	public String getName() {
		return name;
	}


	


		
}

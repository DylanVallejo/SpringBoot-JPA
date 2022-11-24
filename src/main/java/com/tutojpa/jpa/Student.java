package com.tutojpa.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;

//class that will represent our entity on the db 
@Entity(name = "Student")
@Table(
		name = "student",
		uniqueConstraints = {
				@UniqueConstraint(name = "student_email_unique", columnNames= "email")
		}
)

public class Student {
	//defining properties
	@Id
	@SequenceGenerator(
			name = "student_sequence",
			sequenceName ="student_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
		strategy = SEQUENCE,
		generator ="student_sequence"	
	)
	
	@Column(
			name = "id",
			updatable = false
	)
	private Long  id;
	
	@Column(
			name = "first_name",
			nullable = false,
			columnDefinition = "TEXT"
	)
	private String firstname;
	
	@Column(
			name = "last_name",
			nullable = false,
			columnDefinition = "TEXT"
	)
	private String lastName;
	
	
	@Column(
			name = "email",
			nullable = false,
			columnDefinition = "TEXT"
	)
	private String  email;
	
	@Column(
			name = "age",
			nullable=false
	)
	private Integer age;
	
	
	public Student( String firstname, String lastName, String email, Integer age) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	
	
	
	public Student() {
		
	}





	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id +
				", firstname=" + firstname +
				", email=" + email +
				", age=" + age + 
				"]";
	}

	
	
}

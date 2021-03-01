package de.kaffeemann.jpm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "billionaires")
@Data
public class Person {

	@Id
	@GeneratedValue
	Long id;

	@Column(name = "firstName")
	String firstName;

	@Column(name = "lastName")
	String lastName;

	@Column(name = "career")
	String career;

	public Person() {
	}

	public String getCareer() {
		return career;
	}

	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
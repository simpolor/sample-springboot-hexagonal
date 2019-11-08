package io.simpolor.multi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long seq;

	private String name;
	private int grade;
	private int age;
}

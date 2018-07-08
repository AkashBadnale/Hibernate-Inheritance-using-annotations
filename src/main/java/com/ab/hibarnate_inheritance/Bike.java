package com.ab.hibarnate_inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  //  for  TABLE  PER  CLASS 
@Inheritance(strategy=InheritanceType.JOINED)   //  for  TABLE  PER  SUBCLASS
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  //  for  TABLE  PER  CONCRETE  CLASS
@DiscriminatorColumn(name="BIKE",discriminatorType=DiscriminatorType.STRING)
/* name  attribute  in above annotation  is optional , if you havent specified it will take 'DTYPE' */

@DiscriminatorValue(value = "parent")
/* above  tag  is optional   if you havent specified then in column 'BIKE' / 'DTYPE'  value ='className'*/
public class Bike {
	
	@Id
	private int id;
	private String name;
	private String type;

	public Bike() {
		super();
	}

	public Bike(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

}// Bike

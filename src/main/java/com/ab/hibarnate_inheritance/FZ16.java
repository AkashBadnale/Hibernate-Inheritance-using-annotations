package com.ab.hibarnate_inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn  //  required  for  TABLE  PER   SUBCLASS

// below  @AttributeOverrides({   @AttributeOverride  })   for  TABLE PER CONCRETE  CLASS
/*@AttributeOverrides({ 
@AttributeOverride(column = @Column(name="id"), name = "id"),
@AttributeOverride(column = @Column(name="name"), name = "name"),
@AttributeOverride(column = @Column(name="type"), name = "type")
})*/
@DiscriminatorValue(value="fz")
/* above  tag  is optional   if you havent specified then in column 'BIKE' / 'DTYPE'  value ='className'*/
public class FZ16 extends  Bike{

	private  int  engineCapacity;
	private  int mileage;
	private int fzversion;
	public FZ16() {
		super();
	}
	public FZ16(int id, String name, String type,int engineCapacity, int mileage, int fzversion) {
		super(id,name,type);
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.fzversion = fzversion;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getFzversion() {
		return fzversion;
	}
	public void setFzversion(int fzversion) {
		this.fzversion = fzversion;
	}
	@Override
	public String toString() {
		return "FZ16 [engineCapacity=" + engineCapacity + ", mileage=" + mileage + ", fzversion="+fzversion+ "]";
	}
	
}//FZ

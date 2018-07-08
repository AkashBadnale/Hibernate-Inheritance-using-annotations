package com.ab.hibarnate_inheritance;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn  //  required  for  TABLE  PER   SUBCLASS

//below  @AttributeOverrides({   @AttributeOverride  })   for  TABLE PER CONCRETE  CLASS
/*@AttributeOverrides({ 
@AttributeOverride(column = @Column(name="id"), name = "id"),
@AttributeOverride(column = @Column(name="name"), name = "name"),
@AttributeOverride(column = @Column(name="type"), name = "type")
})*/
@DiscriminatorValue(value="cbr")
/* above  tag  is optional   if you havent specified then in column 'BIKE' / 'DTYPE'  value ='className'*/
public class CBR250 extends  Bike{
	private  int  engineCapacity;
	private  int mileage;
	private  int  cbrversion;
	public CBR250() {
		super();
	}
	public CBR250(int id, String name, String type,int engineCapacity, int mileage,int  cbrversion) {
		super(id,name,type);
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.cbrversion = cbrversion;
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
	public int getCbrversion() {
		return cbrversion;
	}
	public void setCbrversion(int cbrversion) {
		this.cbrversion = cbrversion;
	}
	@Override
	public String toString() {
		return "CBR250 [engineCapacity=" + engineCapacity + ", mileage=" + mileage +", cbrversion="+cbrversion+ "]";
	}
}//CBR250

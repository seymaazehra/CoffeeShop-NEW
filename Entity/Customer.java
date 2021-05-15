package Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Abstract.IEntity;

public class Customer implements IEntity{
	   private int id;
	   private String firstName;
	   private String lastName;
	   private LocalDate DateOfBirth;
	   private String NationalityId;
	
   
	
	
   public Customer(int id,String firstName, String lastName, LocalDate DateOfBirth, String NationalityId) {
	   this.setId(id);
	   this.firstName=firstName;
	   this.lastName=lastName;
	   this.DateOfBirth=DateOfBirth;
	   this.NationalityId=NationalityId;
}


public Customer() {
	// TODO Auto-generated constructor stub
}


int getId() {
		return id;
	}
	
public void setId(int id) {
	this.id = id;
}


public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

   

}


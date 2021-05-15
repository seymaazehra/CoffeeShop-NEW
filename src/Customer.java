

import java.sql.Date; 
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer implements IEntity{
	   public int id;
	   public String firstName;
	   public String lastName;
	   public LocalDate dateOfBirth;
	   public String NationalityId;
	
   
	
	
   public Customer(int id,String firstName, String lastName, LocalDate localDate, String NationalityId) {
	   this.id=id;
	   this.firstName=firstName;
	   this.lastName=lastName;
	   this.dateOfBirth=localDate;
	   this.NationalityId=NationalityId;
}
}



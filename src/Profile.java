public class Profile {
 
 //Local Variables for the Media object	
 Boolean available = true;
 String FName, LName, Address, Email, Username, password;
 String phone;
 
 
 //Constructor for a Media Object
 public Profile(String FName, String LName, String Address, String  phone, String Email, String Username, String password){
	 		
	  this.FName = FName;
	  this.LName = LName;
	  this.Address = Address;
	  this.phone = phone;
	  this.Email = Email;
	  this.Username = Username;
	  this.password = password;
	  
 }
 
 //The functions below return the corresponding information for the Media object
	 public String getFName()
	 {
		 	return FName;
	}
	 
	public String getLName()
	 {
		   return LName;
	 }
	
	public String getAddress()
	{
		   return Address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail(){
		return Email;
	}
	
	public String getpassword() {
		return password;
	}
	public String getUsername() {
		return Username;
	}
	
	public String toString() {
		return this.FName + " " + this.LName + " " + this.Address + " " + this.phone + " " + this.Email + " " + this.Username + " " + this.password + " ";
	}
}
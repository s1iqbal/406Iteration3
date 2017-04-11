import java.util.LinkedList;

public class Database {
	//creates a linkedlist to store all the z objects
 LinkedList<Object> storage = new LinkedList<Object>();
 Profile Admin = new Profile("Saad", "Iqbal", "Ryerson", 416000000, "SaadIqbal@hotmail.com", "SaadIqbal", "password");
 Profile User;
 //initializes the media objects and places them inside storage
 Database() {
	 
 }

//function to initialize a new media object
 public void addProfile(String FName, String LName, String Address, int phone, String Email, String Username, String password) {
 //int incrementer = 11;
  User = new Profile(FName, LName, Address, phone, Email, Username, password);
  storage.add(User);
 }
 
 public boolean checkCredentials(String Username, String Password) {
	 for (int i = 0; i < storage.size(); i++) {
		 if ( (((Profile) storage.get(i)).getUsername()).equalsIgnoreCase(Username)
			&&(((Profile) storage.get(i)).getpassword()).equals(Password)) {
				return true;
		 } 
	 }
	return false;
	 
 }


//Function to find the borrowedItems based on the person searched
//It will return a array of strings. It checks for the person, and finds all the media
//inside storage to see if that media is being borrowed by that person.
//Then it stores that media that the person is borrowing to the array, then returns that array



//testing ground for loaning media

}
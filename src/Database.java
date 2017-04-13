import java.util.LinkedList;

public class Database {
	//creates a linkedlist to store all the z objects
 LinkedList<Profile> storage = new LinkedList<Profile>();
 Profile Admin = new Profile("Saad", "Iqbal", "Ryerson", "416000000", "SaadIqbal@hotmail.com", "SaadIqbal", "password");
 Profile User;
 //initializes the media objects and places them inside storage
 Database() {
	 
 }

//function to initialize a new media object
 public void addProfile(String FName, String LName, String Address, String phone, String Email, String Username, String password) {
  User = new Profile(FName, LName, Address, phone, Email, Username, password);
  storage.add(User);
 }
 
 public void addReport(Report report, Profile profile){
	 for(int i=0; i < storage.size() ; i++) {
	 		if (profile.getUsername().equals(storage.get(i).getUsername())) {
	 			profile.reports.add(report);
	 		}
	 	}
 }
 
 public void editProfile(String FName, String LName, String Address, String phone, String Email, String Username, String password) {
	 	for(int i=0; i < storage.size() ; i++) {
	 		if (Username.equals(storage.get(i).getUsername())) {
	 			storage.set(i,new Profile(FName, LName, Address, phone, Email, Username, password) );
	 		}
	 	}
	 }
 
 public Profile checkCredentials(String Username, String Password) {
	 for (int i = 0; i < storage.size(); i++) {
		 if ( (((Profile) storage.get(i)).getUsername()).equalsIgnoreCase(Username)
			&&(((Profile) storage.get(i)).getpassword()).equals(Password)) {
				return storage.get(i);
		 } 
	 }
	return null;
	 
 }




}
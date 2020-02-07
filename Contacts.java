



public class Contacts{
	private String Name;
	private String Last_name;
	private Integer Phone_number;
	private String Email_address;
	public Contacts(String name, String last_name, Integer phone_number, String email_address){
		Name=name;
		Last_name=last_name;
		Phone_number=phone_number;
		Email_address=email_address;

	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastname() {
		return Last_name;
	}

	public void setLastname(String lastname) {
		Last_name = lastname;
	}

	public Integer getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		Phone_number = phone_number;
	}

	public String getEmail_address() {
		return Email_address;
	}

	public void setEmail_address(String email_address) {
		Email_address = email_address;
	}
}
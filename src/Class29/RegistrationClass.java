package Class29;

public class RegistrationClass {
	private String email="";
	private String userName="";
	private String password="";
	
	public String getUserName() {
		return userName;}
	
	public void setUserName() {
		if(!userName.isEmpty())
			if (userName.length()>6){
			this.userName=userName;}
		else{
			System.out.println("username cant be empty");}
		}
	
	public String getEmail() {
		return email;}
	
	public void setEmail(String email) {
		if(email.contains("gmail")) {
		this.email = email;}
		else {
			System.out.println("pls enter valid email, gmail");}
		}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty()) {
			if (password.length()>6) {
				if (password.contains(this.userName)) {
		this.password = password;
		   }else {
			   System.out.println("password cant contain username");}
			}else{
				System.out.println("password be more than 6 char");}
		    }else {
			    System.out.println("password cant be empty");}}
	
    public static void main(String[] args) {
	RegistrationClass obj=new RegistrationClass();
	obj.setEmail("123gaggag@gmail.com");
	System.out.println(obj.email);
}
}
	
	

	
	
	



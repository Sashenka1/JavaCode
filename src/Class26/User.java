package Class26;

public class User {
	public String name;
	public long mobile;
	
	public User(String name, long mobile){
	this.name=name;
	this.mobile=mobile;}}
	
	//public User() {}
	
	class UserInfo extends User{
		
		public String address;
		
		public UserInfo(String name, long mobile, String address) {//by default super()
			super(name, mobile);
			this.address=address;}
		public void userD() {
			System.out.println(""+name+""+mobile+""+address);
			
		}}
	
	



package Class30;

public class EncapsulationDemo {
	
	//class EncapsulationDemo{
	private String acc_no;  
	private String name,email;  
	private float amount;
	
	public String getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(String acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}  }
class Main{
public static void main(String[] args) {
	// TODO Auto-generated method stub
EncapsulationDemo ed= new EncapsulationDemo();
ed.setAcc_no("7560504000");
ed.setName("Sumair");
ed.setEmail("sumair@syntaxsolutions.com");
ed.setAmount(500000.0f);
System.out.println(ed.getAcc_no()+" "+ed.getName()+" "+ed.getEmail()+" "+ed.getAmount());

}}
	
	   



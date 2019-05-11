package Class27;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone obj=new Phone(); cant creat Phone class ,it is an abstract class
		Phone phone1=new iPhone();
		phone1.makeCall();
		phone1.unlockPhone();
		phone1.viewPic();
		phone1.sendText();
		
		//Phone phone2=new Samsung();
		//phone2.makeCall();
		//phone2.unlockPhone();
		//phone2.viewPic();
		//phone2.sendText();

	}

}

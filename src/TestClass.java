import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str=new String("Hello");
//		str.isEmpty();
//		str.charAt(0);// isEmpty is build in method
//		Scanner scan=new Scanner(System.in);
//		scan.hasNextInt();
//		// 2 types of method/build in= limited and read only
//		//and user defined = we creat them, unlimited and modified.
		
		
		//creating an objest
//		TestClass obj= new TestClass();
//
//	}
//		void askHowAreYou(String name) {
//			System.out.println("How are you Amina?");}}
		TestClass number= new TestClass();
		//Scanner scan=new Scanner(System.in);
		//scan.hasNextInt();
		number.EvenOROdd(10);
		
	}
// void is a return type, EvenOROdd =method name		
	void EvenOROdd(int number) {
		if( number %2==0) {
			System.out.println(number+" is an even #");
		}else {
			System.out.println(number+" is Odd");
		}
			
		}
	}



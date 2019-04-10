
public class April9 {
	
	
	
//protected String someMethod(String name) {
//
//String reverse="";
//for ( int i=name.length()-1; i>=0; i--) {
//	reverse += name.charAt(i);
//}
//return reverse;
//}


	public static void main(String[] args) {
//		
//		April9 obj=new April9();
//		String email=obj.creatEmail("Joh", "Snow","gmail");
//		System.out.println(email);
//		System.out.println(email.toLowerCase());
//		
//		email=obj.creatEmail("Bob", "snow", "outlook");
//		System.out.println(email);}
//		
//	  String creatEmail(String name, String lastName, String emailType) {
//		 String email =name+lastName+"@"+emailType+".com";
//		 return email.toLowerCase();}}
		
//		April9 obj=new April9();
//		char myGrade=obj.getGrade(91);
//		System.out.println(""+myGrade);}
//		
//     
//		char getGrade(int score) {
//		char grade;
//			if (score>90){
//			grade= 'A';
//			}else if (score >80) {
//			grade='B';
//			}else if(score>70) {
//			grade='C'; 
//			return grade;
//		
/		//April9 obj=new April9();
		//String hi =obj.someMethod("Hi, how are you?");
	//System.out.println(hi);}}
////			
	
	public boolean isPalindrome( String str) {
		String reverse="";
		boolean flag=false;
		for ( int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		if( reverse.equalsIgnoreCase(str)) {
		flag=true;}
		return flag;
		
		}}
		
	
		
	

	

	

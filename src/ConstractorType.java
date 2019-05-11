
public class ConstractorType {
	
	ConstractorType() {
		System.out.println("I'm a constractor without par");
		}
	ConstractorType( String str){//local var with par
		System.out.println("I'm a constructor with 1 par."+str);
	}
	ConstractorType( String str1, int a){
		System.out.println("I'm a constr with 2 par"+a+"and"+str1);
	}

	public static void main(String[] args) {
		
   ConstractorType obj=new ConstractorType();
   ConstractorType obj1=new ConstractorType("String");
   ConstractorType obj2=new ConstractorType("String", 123);//has to match the init of string, int
	}

}

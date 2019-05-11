package Class27;

public abstract class Marks {
	 abstract int getPercentage(); }

   class A extends Marks{
	  int a,b,c;
	public A(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;}
	
	@Override
	int getPercentage(){
		
		return(a+b+c)/3;}}
	class B extends Marks{
	  int a,b,c,d;
	B(int a, int b, int c, int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;}
		@Override
		int getPercentage() {
		return(a+b+c+d)/4;}}
	
	
	
		
		
	
	



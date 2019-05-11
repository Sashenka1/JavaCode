package Class27;

public abstract class Phone {
	public void makeCall() {
		System.out.println("Can make a call");
	}
	public void sendText() {
		System.out.println("Can send text");}
	
	public abstract void unlockPhone();
	public abstract void viewPic();}

   class iPhone extends Phone{//concrete class is a class that inherited from an abstract class
	   //or implem by interface and prov impl of all unimplem abst class
	   @Override
   public void unlockPhone(){
	   System.out.println("To unlock phone we can use ...");
   }
	@Override
	public void viewPic(){
		System.out.println("view pic on iphone");}
	
	class Samsung extends Phone{
		@Override
		
		public void viewPic() {
			System.out.println("Can view piv on Samsung");}
			
		public void unlockPhone() {
			System.out.println("To nlock iPhone ");
		}}}
	


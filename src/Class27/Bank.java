package Class27;

public interface Bank {
	static  String name="Bank";//by default all var inside interface r public,static, final
	  String hello="hi";
	  
	//by def compl adds public and abstract to every method
    public void hasChecking();
	void hasSavings();
	void hasCreditCard();
	//static void hasLoan();//cant have abstract static method.
    //Bank()//cant have a constractor.
    }class BOA implements Bank {
		@Override
	public void hasChecking() {
			System.out.println("BOA has 2 checking");}
		@Override
	public void hasSavings() {
			System.out.println("BOA has savings");}
	@Override
	public void hasCreditCard() {
		System.out.println("BOA has credit card");}}
		
	class PNC implements Bank{

		@Override
		public void hasChecking() {
			System.out.println("PNC savings");
			// TODO Auto-generated method stub
		}@Override
		public void hasSavings() {
			// TODO Auto-generated method stub
			System.out.println("PNC savings");}
		@Override
		public void hasCreditCard() {
			// TODO Auto-generated method stub
			System.out.println("PNC cr card");
			
		}
		
	}

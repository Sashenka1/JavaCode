
public class Nintendo extends Game{
	
	public static void main(String[] args) {
		Nintendo a=new Nintendo();
		a.controller="red";
		a.cd=false;
		a.ifTVneed=true;
		a.powerSource="outlet";
		//attributes
		System.out.println(a.controller);
		System.out.println(a.cd);
		System.out.println(a.ifTVneed);
//		System.out.println(a.powerSource);
//		//behaviors
		//System.out.println(a.portable()+"is game system portable");//to call behavors 
		//System.out.println(a.surfWeb()+"able to surf the web");
		//a.readDisk();
		a.avleToPlay();
		System.out.println(a.canPlayMarioGAMES());}
		
	    boolean canPlayMarioGAMES() {
	    	return true;
	    }
	
}
		
	



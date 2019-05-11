package Class29;

public interface Shape {
	void culculateArea(int x);
	void culculatePerimeter(int x);
}
 class Circle implements Shape{
	@Override
	public void culculateArea(int x) {
		System.out.println("area of a circle"+(3.14*x*x));}
    @Override
	public void culculatePerimeter(int x) {
    	System.out.println("the perimiter of circle"+(2*3.14*x));}}
	
class Square implements Shape{

	@Override
	public void culculateArea(int x) {
	System.out.println("area of square "+(x*x));}
	@Override
	public void culculatePerimeter(int x) {
	System.out.println("perimiter of square "+(x*4));
		
	}
	
}
	
	
	



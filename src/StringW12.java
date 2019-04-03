
public class StringW12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String day= new String("SundayisJavadayandu");
		//for (int i=str.length()-1; i>=0; i--) {
			//System.out.print(str.charAt(i));}
		
//		if(!day.isEmpty()) {
//			if(day.length()%2!=0 && day.length()>=3) {
//				System.out.println(day.charAt(day.length()/2));}}
//		
//		

				//Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
                //Example Output:
                 //Mom’s first name? Mary
		         //Dad’s first name? Daniel
		          //Boy or Girl? boy
                   //Suggested baby name: DANRY
		           //Example output" 
		          //Mom’s first name? Mary

				//Dad’s first name? Daniel

				//Boy or Girl? girl

//				//Suggested baby name: MAIEL
//		String str="I love the sun";
//		String newStr=str.replace(" ", "");
//		System.out.println(newStr);
//		
//		String str1="I love 1234";
//		String replaced=str1.replaceAll("[^a-zA-Z]","");
//		System.out.println(replaced.length());
//		
//		String str3="Is it sunny?Is it raining?Do we have a class today?";
//		String [] array=str3.split("[?]");
//		System.out.println(array.length);
		//String str="I stayed home, becouse I overslept.";
		
		//String newString=str.substring(6);
		//System.out.println(newString);
		
		int largest = 0; //find the largest, 2 large, smallest

        int secLarge = 0;

        int smallest = 0;

        int[] array = { 65, 56, 48, 55, 12, 0, 100, 1789, 35 };

        for (int i = 0; i < array.length; i++) {

            if (largest < array[i]) {

                secLarge = largest;

                largest = array[i];}}

          for (int i = 0; i < array.length; i++) {

            if (smallest > array[i]) {

                smallest = array[i];}}
        System.out.println(secLarge);

        System.out.println(largest);

        System.out.println(smallest);

    }}

	



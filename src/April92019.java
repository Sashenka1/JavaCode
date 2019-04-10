
public class April92019 {

	public static void main(String[] args) {
	
		April92019 obj=new April92019();
		String [] array=obj.getWordsFromString(" Have a good night");
		for ( int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		for ( String word:array) {
			System.out.println(word);
	}}
		
		private String[] getWordsFromString(String str) {
			String[] words=str.split(" ");
			return words;
			
		}

	}



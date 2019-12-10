import java.util.Arrays;

// Java program to check string with unique 
// characters using sorting technique 
//time complexity: O(N logN)
public class UniqueStringSortingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniqueStringSortingAlgo obj=new UniqueStringSortingAlgo();
		
		String input="Keshav";
		if(obj.uniqueString(input)) {
			System.out.println("This string "+input+" has all unique string");
		}
		else {
			System.out.println("This string "+input +"  has a duplicate string");
		}
	}

	private boolean uniqueString(String str) {
		// TODO Auto-generated method stub
		
		char [] charArray=str.toCharArray();
		Arrays.sort(charArray);
		for(int i=0;i<charArray.length-1;i++) {
			if(charArray[i]!=charArray[i+1]) {
				continue;
			}
			else {
				return false;
			}
			
		}
		return true;
	}

}

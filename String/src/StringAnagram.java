import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="SILENT";
		String y="LISENT";
		
	char a[]=x.toCharArray();
	char b[]=y.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	boolean result=Arrays.equals(a, b);
	
	if(result==true) {
		System.out.println("String is anagram");
	}
	else {
		System.out.println("String is not anagaram");
	}
		

	}

}

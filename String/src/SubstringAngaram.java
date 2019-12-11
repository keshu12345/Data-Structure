import java.util.Arrays;

public class SubstringAngaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="HE is AradhYa";
		String y="Is He HRADAya";
		x=x.replace(" ", "");
		y=y.replace(" ", "");
		 x=x.toUpperCase();
		 y=y.toUpperCase();
		 
		 char a[]=x.toCharArray();
		 char b[]=y.toCharArray();
		 Arrays.sort(a);
		 Arrays.sort(b);
		 boolean result=Arrays.equals(a, b);
		 
		 if(result==true) {
			 System.out.println("String is a anagram");
		 }
		 else {
			 System.out.println("String is not anagram");
		 }
				

	}

}


public class SubstringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="too Hot To HOOT";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		char y []=x.toCharArray();
		int size=y.length;
		char [ ]a=new char[size];
		int i=0;
		while(i!=size) {
			a[i]=y[size-1-i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				
				System.out.println("Not a Palindrome");
			}
			else{
				i++;
				continue;
				
			}
		}
     System.out.println("Palindrome");
	}

}

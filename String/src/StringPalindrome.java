
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String x="RADAR";
		char y[]=x.toCharArray();
		int size=y.length;
		char [] a=new char [size];
		int i=0;
		while(i!=size) {
			a[i]=y[size-1-i];
			i++;
		}
		
		/*
		 * System.out.println(a); System.out.println(y);
		 */
		i=0;
		while(i!=size) {
			if(a[i]!=y[i]) {
				System.out.println("String is not palindrome");
				System.exit(0);
			}
			else {
				i++;
				continue;
			}
			
		}
		System.out.println("String is palindrome");

	}

}

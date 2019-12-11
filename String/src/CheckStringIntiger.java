
public class CheckStringIntiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="6789";
		char []y=x.toCharArray();
		int size=y.length;
		int i=0;
		
		while(i!=size) {
			if(y[i]>='0'&& y[i]<='9') {
				i++;
			}
			else {
				System.out.println("Not an integer String");
				System.exit(0);
			}
			
		}
		System.out.println("This is integer String");
	}
	

}

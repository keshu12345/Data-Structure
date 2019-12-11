
public class StringLengthWithoutLenthFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="keshav";
		x=x.concat("\0");
		char y[]=x.toCharArray();
		int i=0;
		int count=0;
		while(y[i]!='\0') {
			i++;
			count++;
		}
		System.out.println(count);

	}

}

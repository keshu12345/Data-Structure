
public class StringConvertLowerCaseToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="keshav";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		int i=0;
		while(i<size) {
			a[i]=(char) (y[i]-32);
			i++;
		}
		System.out.println(x);
		System.out.println(a);

	}

}

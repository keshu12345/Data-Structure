
public class SwappingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="KESHAV";
		String y="RAJPUT";
		String temp="";
		
		System.out.println(x);
		System.out.println(y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping:"+x);
		System.out.println("After Swapping:"+y);

	}

}

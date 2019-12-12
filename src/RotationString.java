
public class RotationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orginal="KESHAV";
		String keyString="ESHAVK";
		orginal=orginal.concat(orginal);
		if(orginal.contains(keyString)) {
			System.out.println("String is roation string");
		}
		else {
			System.out.println("String is not roation string");
		}

	}

}


public class UniqueChararBruteForce {

	 
	 boolean uniqueCharacterString(String str) {
		 
		 for(int i=0;i<str.length();i++) {
			 for(int j=i+1;j<str.length();j++) {
				 if(str.charAt(i)==str.charAt(j)) {
					 return false;
				 }
			 }
			
		 }
		return true;
	 }
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 UniqueChararBruteForce obj=new  UniqueChararBruteForce();
		 
		 String input="Welcome to Keshav Rajput ";
				 
				 if(obj.uniqueCharacterString(input)) {
					 System.out.println("The String : "+  input + " has all unique characters");
				 }
				 else {
					 System.out.println("This is String "+input+"has a duplicate characters");
				 }

	}

}

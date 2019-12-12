
public class DeleteOccuranceCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="JHANSISTATE";
		char []y=x.toCharArray();
		int size=y.length;
		char key='S';
		String result="";
		int i=0;
		while(i!=size) {
			if(y[i]!=key) {
				result=result+y[i];
			}
			i++;
		}
		System.out.println(result);

	}

}

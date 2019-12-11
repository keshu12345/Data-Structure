
public class CntVowConsUsingCapticalLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="keshav's katalyst technology";
		x=x.toUpperCase();
		char []y=x.toCharArray();
		int size=y.length;
		int volCnt=0;
		int consCnt=0;
		int splCnt=0;
		int i=0;
		while(i!=size) {
			if(y[i]>='A'&& y[i]<='Z') {
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U') {
					volCnt++;
				}
				else {
					consCnt++;
				}
				
			}
			else {
				splCnt++;
			}
			i++;
			
		}
		System.out.println(volCnt);
		System.out.println(consCnt);
		System.out.println(splCnt);

	}

}

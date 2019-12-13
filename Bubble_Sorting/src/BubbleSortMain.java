
public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {12,79,80,69,10,27,55};
		int n=7;
		
		BubbleMethod bm=new BubbleMethod();
		bm.bubbleSort(a, n); 
		DisplayElement de=new DisplayElement();
		de.displayElement(a, n);
		

	}
	

}


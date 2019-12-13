
public class SelectionSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {12,79,80,69,10,27,55};
		int n=7;
		SelectionSortMethod ss=new SelectionSortMethod();
		ss.selectionSort(a, n);
		DisplayElement de=new DisplayElement();
		de.display(a, n);
		

	}

}

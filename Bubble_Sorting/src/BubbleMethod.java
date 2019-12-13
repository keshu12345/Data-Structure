
public class BubbleMethod {
int i,j,temp;
	void bubbleSort(int a[],int n) {
		for(i=0;i<=n-2;i++) {
			for(j=0;j<n-2-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}


public class SelectionSortMethod {
	int i,j,k,min,temp;
	void selectionSort(int a[],int n) {
		for(i=0;i<=n-2;++i) {
			min=a[i];
			k=i;
			for(j=i+1;j<=n-1;j++) {
				if(a[j]<min) {
					min=a[j];
					k=j;
				}
				
				
			}
			temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			
		}

	}
	
}

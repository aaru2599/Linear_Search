package in.LinearSearch;

public class Linesr_Search {
	
static int SearchInTheArray(int []arr,int target ) {
	
	for(int i=1;i<5;i++) {
		if(arr[i]==target) {
			return i;
		}
}
	return -1;
}

	
public static void main(String[] args) {
	int a[]= {10,2,5,6,7,9,-5,-9,-8};
	int target=5;
	int index=SearchInTheArray(a, target);
	System.out.println(index);
}

}

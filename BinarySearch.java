import java.util.Random;
public class BinarySearch {
	int step=0;
	public int binSearch(int[] array,int key,int left,int right){
		int middle=(left+right)/2;
		
		System.out.println(this.step);

		if(left>right || middle == array.length-1){
			return -1;
		}
		else{

			if(key==array[middle]){
				return key;
			}
			else {
				this.step++;
				if(key>array[middle+1]){
					return binSearch(array,key,middle+1,right);
				}
				else{
					return binSearch(array,key,left,middle-1);
				}
			}//else
		
		}//if left>right	
		
	}
	public static void main(String[] args) {
		BinarySearch newSearch = new BinarySearch();
		Random rand = new Random();
		int[] array = new int[100];
		int key=37;
		for(int i=0;i<array.length;i++){
			array[i]=rand.nextInt(100)+1;
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
		System.out.print(newSearch.binSearch(array,key,0,array.length));
	}
}
import java.util.Random;
public class bouble{


public static void main(String[] args) {
	Random rand = new Random();
	int[] numbers = new int[100];

	for(int i=0;i<numbers.length;i++){
		numbers[i]=rand.nextInt(100)+1;
	}

	for(int i=0;i<numbers.length-1;i++){
		for(int j=numbers.length-1;j>=1;j--){
			if(numbers[j]<numbers[j-1]){
				int k = numbers[j];
				numbers[j]=numbers[j-1];
				numbers[j-1]=k;
			}

		}
	}
	for(int i=0;i<numbers.length;i++){
		System.out.print(numbers[numbers.length-i-1]+" ");
	}
}

}
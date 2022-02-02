import java.util.Random;

public class MinMaxAvg {
	


	public static void main(String[] args) {
		int max=0;
		int min=100;
		int avg=0;
		int total=0;
		Random rand = new Random();
		int[] numbers = new int[100];

		for (int i=0;i<numbers.length;i++){
			numbers[i]=rand.nextInt(100)+1;
			
			if(max<numbers[i]){
				max=numbers[i];
			}
			
			if(min>numbers[i]){
				min=numbers[i];
			}
			total+=numbers[i];

			System.out.print(numbers[i]+" ");		
		}

		System.out.println();
		avg=total/numbers.length;
	System.out.println("max: "+max);
	System.out.println("min: "+min);
	System.out.println(avg);
}
}
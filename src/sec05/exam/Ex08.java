package sec05.exam;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int a = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				a++;
				sum = sum + array[i][j];
			}
		}
		
		avg = (double)sum / a;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}

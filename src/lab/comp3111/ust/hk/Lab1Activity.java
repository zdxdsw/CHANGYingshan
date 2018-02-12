package lab.comp3111.ust.hk;

public class Lab1Activity {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i : arr)
			sum += i;
		System.out.println(String.format("Sum of the numbers is %d", sum));
		int maxResult = arr[0];
		for(int i=1; i<arr.length; ++i)
			if (arr[i] > maxResult)
				maxResult = arr[i];
		int minResult = arr[0];
		for(int i=1; i<arr.length; ++i)
			if (arr[i] < minResult)
				minResult = arr[i];
		System.out.println("Min = " + minResult + "; Max = " + maxResult);
	}
}

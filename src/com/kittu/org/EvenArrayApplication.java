package com.kittu.org;

public class EvenArrayApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[] arr= {1,2,4,6,8,45,56,78}; for(int i=0;i<arr.length;i++) { if(arr[i] %
		 * 2==0) { System.out.println(arr[i]); //break; } else {
		 * System.out.println(arr[i]+"is not multiply 2"); } }
		 */
		 
		/*
		 * int[] arr={1,2,3,4,5,45,67}; // System.out.println(arr[0]); //
		 * System.out.println(arr[6]);; int[] sum; for (int i=arr.length-1;i>=0;i--) {
		 * sum=0; sum=sum+arr[i]; } System.out.println(sum);
	int sum	 */
		int sum=0;
		int sumkri=0;
int[] arr= {1,2,3,4,5,6,7,7,8};
for(int sumkrish:arr) {
	
	sumkri=sumkri+sumkrish;
}
System.out.println("sumkri::"+sumkri);
for(int i=0;i<arr.length;i++)
{
//sum=0;
sum=sum+arr[i];
	//System.out.println(arr[i] );
}
System.out.println(sum);

	}

}

class Demo{
	public static void main(String[]args){
		
		int[] arr = {2,4,6};
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				even ++;
			}
			else{
				odd ++;
			}
		}
		
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
	}
}

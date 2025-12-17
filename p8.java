class Demo{
	public static void main(String[]args){
		int num=12345;
		int rem=0;
		int mid=0;
		int rev=0;
			while(num>0){
				rem=num%10;
				num=num/10;
				break;
			}
			while(num>9){
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}num=0;
			while(rev>0){
				mid=rev%10;
				num=num*10+mid;
				System.out.print(" "+mid);
				rev=rev/10;
			}
	}
}

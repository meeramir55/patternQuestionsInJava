class P7{
	public static void main(String[]args){
		int x=5;
		int count=5;
		for (int i=1;i<=x;i++){
			for (int j=i;j<=count;j++){
				System.out.print(j);
			}
			System.out.println();
			count++;
		}
	}
}
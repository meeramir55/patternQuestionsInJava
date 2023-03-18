class P9{
	public static void main(String[]args){
		int x=5;
		for (int i=1;i<=x;i++){
			for(int j=1;j<=x;j++){
				if(i%2==0){
					System.out.print(i);
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
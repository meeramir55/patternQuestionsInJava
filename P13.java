class P13{
	
	public static void main(String args[]){
		int x=5;
		int a=4;
		int b=4;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1){
					System.out.print(j);
				}
				else if (j==1){
					System.out.print(i);
				}
				else if(i==x){
					System.out.print(a);
					a--;
				}
				else if(j==x){
					System.out.print(b);
					b--;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
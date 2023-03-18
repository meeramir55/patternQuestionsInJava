class pattern5{
	public static void main(String args[]){
		int x=1;
		for(int i= 0;i<5;i++){
			int y=1;
			for(int j=0;j<6;j++){
				if(j%2==0){
					System.out.print(y);
					y++;
				}
				else{
					System.out.print(x);
				}
			}
			x++;
			System.out.println();
		}
	}
}
class P5{
	public static void main(String[]args){
		int x =5;
		for (int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				if(j%2==0){
					System.out.print(1);
				}
				else{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
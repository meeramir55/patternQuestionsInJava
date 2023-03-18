class P4{
	public static void main(String[]args){
		int x =5;
		int count=1;
		for (int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
class P8{
	public static void main(String[]args){
		int x =5;
		int alphabit=65;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print((char)(alphabit+j));	
			}
			System.out.println();
		}
	}
}
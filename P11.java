class P11{
	public static void main(String args[]){
		int m=5;
		int a=65;
		for(int i=0;i<m;i++){
			for(int j=i;j<m+i;j++){
				System.out.print((char)(j+a));
			}
			System.out.println();
		}
	}
}
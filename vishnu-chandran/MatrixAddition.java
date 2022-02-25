package matrix;
public class Matrixaddition {

	public static void main(String[] args) {
		int a[][]={{10,20},{30,40}};  
		int b[][]={{50,60},{70,80}};  
		int c[][]=new int[2][2];  
		    
		for(int i=0;i<2;i++){  
		for(int j=0;j<2;j++){  
		c[i][j]=a[i][j]+b[i][j];  
		System.out.print(c[i][j]+" ");  
		}  
		System.out.println();
		}  
		
	}
}

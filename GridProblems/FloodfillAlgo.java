import java.util.*;
public class FloodfillAlgo {
	public static void Displaygrid(int grid[][]) {
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(grid[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	//use recursion in this function
	public static void BucketFill(int grid[][], int x, int y, int vac) {
		if(grid[x][y]==vac) {
			grid[x][y]=0;		
			BucketFill(grid, x+1, y, vac);
			BucketFill(grid, x-1, y, vac);
			BucketFill(grid, x, y+1, vac);
			BucketFill(grid, x, y-1, vac);
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int grid[][] = {
				{0,0,0,0,0,0,0},
				{0,1,1,4,2,1,0}, 
				{0,1,1,4,2,1,0},
				{0,1,2,2,2,1,0},
				{0,1,2,2,2,2,0},
				{0,1,1,3,3,3,0},
				{0,0,0,0,0,0,0}
		};
		int x,y;
		Displaygrid(grid);
		System.out.println("Enter the coordinates (1-5),(1-5)");
		x=sc.nextInt();
		y=sc.nextInt();
		
		//vac=value at coordinate
		int vac=grid[x][y];
		BucketFill(grid, x, y, vac);
		Displaygrid(grid);
		sc.close();
		
		
	}

}

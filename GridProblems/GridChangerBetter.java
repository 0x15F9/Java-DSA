import java.util.Scanner;

public class GridChangerBetter {
	public static void Displaygrid(int grid[][]) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(grid[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int grid[][] = {
				{1,1,4,2,1}, 
				{1,1,4,2,1},
				{1,2,2,2,1},
				{1,2,2,2,2},
				{1,1,3,3,3}
		};
		int x,y;
		Displaygrid(grid);
		System.out.println("Enter the coordinates (0-4),(0-4)");
		x=sc.nextInt();
		y=sc.nextInt();
		
		for(int i=x-1; i<=x+1;i++) {
			for(int j=y-1; j<=y+1; j++) {
				if(((i==x)&&(j==y)) || ((i<0)||(j<0)||(i>4)||(j>4)))
					continue;
				if(grid[i][j]==grid[x][y])
					grid[i][j]=0;
			}
		}
		grid[x][y]=0;
		
		Displaygrid(grid);
		sc.close();

	}

}

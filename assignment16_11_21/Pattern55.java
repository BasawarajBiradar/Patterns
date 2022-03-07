package assignment16_11_21;

public class Pattern55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<6; j++)
			{
				if(j+i<=8 && j-i<=0)
					System.out.print(j+1);
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}

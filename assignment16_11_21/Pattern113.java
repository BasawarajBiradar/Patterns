package assignment16_11_21;

public class Pattern113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<14; i++)
		{
			for(int j=0; j<17; j++)
			{
				if(j-i>=12 || j+i<=12)
					System.out.print(" ");
				else
					System.out.print("*");
			}System.out.println();
		}

	}

}

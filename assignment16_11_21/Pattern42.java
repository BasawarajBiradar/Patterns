package assignment16_11_21;

public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(j+i>=9 || j-i>=0)
					System.out.print(j+1+" ");
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}

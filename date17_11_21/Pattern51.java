package date17_11_21;

public class Pattern51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i+j>=4 && j-i>=-4)
				{
					if(i<=4)
					System.out.print(i+1+" ");
					else
						System.out.print(9-i+" ");
				}
					
				else
					System.out.print(" ");
			
			}System.out.println();
		}

	}

}

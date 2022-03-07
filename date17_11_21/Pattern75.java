package date17_11_21;

public class Pattern75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<13; i=i+2)
		{
			for(int j=0; j<13; j++)
			{
				if(j-i<=0) 
				{
					if(2*j==i)
					System.out.print(" ");
					else
						System.out.print("*");	
				}
				
			}System.out.println();
		}

	}

}

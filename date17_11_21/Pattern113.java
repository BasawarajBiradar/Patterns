package date17_11_21;

public class Pattern113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<13;i++)
		{
			for(int j=0; j<17; j++)
			{
				if(j+i>=3 && j-i>=-4 && j-i<=5 && j<=8)
					System.out.print("*");
				else if(j>8 && j+i>=11 && j-i<=13 && j+i<=20)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}

	}

}

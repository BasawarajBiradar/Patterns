package date17_11_21;

public class Pattern73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<9;  i=i+2)
			{
			int counter=0;
			for(int j=0; j<9; j++)
			{
				
				if(j-i<=0)
					System.out.print((char)(counter+65));
				else
					System.out.print(" ");
				if(j<i/2)
				counter++;
				else
					counter--;
				
			}System.out.println();
			}

	}

}

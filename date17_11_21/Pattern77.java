package date17_11_21;

public class Pattern77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		int counter=1;
		
		for(int i=0; i<5; i++)
		{
			counter=start;
			int diff=4;
			for(int j=0; j<5; j++)
			{
				if(j-i<=0)
				{
					System.out.print(counter+" ");
				      counter=counter+diff;
				       diff--;
				}
			}
			System.out.println();
			start++;
		}

	}

}

package alphaPattern;
public class Pattern1 {
	public static void main(String[] args) 
  {
	 System.out.println("Program started");
	 int lines=5;
	 int charcount=1;
	 char ch='A';
	 int mid=(lines+1)/2;
	 int spacecount=2;
	 for(int i=1;i<=lines;i++)
	 {
		for(int j=1;j<=spacecount;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=charcount;k++)
		{
			if(k==1||k==charcount)
			{
				System.out.print(ch);
			}
			else
			{
				System.out.print("*");
			}
			 ch++;
		}
		 System.out.println();
		 ch='A';
		 if(i<mid)
		 {
			 spacecount--;
			 charcount=charcount+2;
		 }	 
		 else
		 {
			 spacecount++;
			 charcount=charcount-2;
		 }
	 }		 
	System.out.println("Program Ended");
 }
}

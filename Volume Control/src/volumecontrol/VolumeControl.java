package volumecontrol;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class VolumeControl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int useCase = sc.nextInt();
		while(useCase!=0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    System.out.println(Math.abs(x-y));
		    useCase--;
		}
		
	}
}

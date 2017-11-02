package hello.helpers;

import org.springframework.stereotype.Component;

@Component
public class NumbersGame 
{
	public boolean isPrime(int input)
	{		
		int square = (int)Math.sqrt(input) + 1;
		
		if((input == 2 || input == 3) || (input % 2 == 0))
		{
			return false;
		}
		
		for (int x = 3; x < square; x+=2)
		{
			if(input % x == 0)
			{
				return false;

			}
		}
		return true;
	}
			
}

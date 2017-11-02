package hello.helpers;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch
{
	public int sort(int[] arrayToSort, int number)
	{
		int low = 0;
		int high = arrayToSort.length -1;
		int medium = 0;
		
		while(low <= high)
		{
			medium = (low + high) / 2;
			if(arrayToSort[medium] == number)
			{
				return number;
			}
			else if(arrayToSort[medium] < number)
			{
				low = medium + 1;
			}
			else if(arrayToSort[medium] > number)
			{
				
				high = medium -1;
			}
		}
		return 0;
		
	}
	
	public int anotherSort(int[] arrayToSort, int number, int low, int high)
	{		
		int medium = (high + low) / 2;
		
		if(arrayToSort[medium] == number)
		{
			return number;
		}
		else if (arrayToSort[medium] > number )
		{
			high = medium - 1;
		}
		else if (arrayToSort[medium] < number)
		{
			low = medium + 1;
		}
		
		return anotherSort(arrayToSort, number, low, high);
		
	}
	
	
}
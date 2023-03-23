package DSA_Pratices;

/// Given a string, write a methods to print all its subsequences

class printSubsequence
{

	static void printArray(int arr[], int size)
	{
		for (int i = 0; i < size; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("\n");
		return;
	}

	
	static int getSuccessor(int arr[], int k, int n)
	{
		
		int p = k - 1;
		while (arr[p] == n)
		{
			p--;
			if (p < 0)
			{
				break;
			}
		}

		if (p < 0)
		{
			return 0;
		}

		arr[p] = arr[p] + 1;
		for (int i = p + 1; i < k; i++)
		{
			arr[i] = 1;
		}
		return 1;
	}


	static void printSequences(int n, int k)
	{
		int[] arr = new int[k];
		for (int i = 0; i < k; i++)
		{
			arr[i] = 1;
		}

		
		while (true)
		{
			
			printArray(arr, k);
			if (getSuccessor(arr, k, n) == 0)
			{
				break;
			}
		}
	}

	
	public static void main(String[] args)
	{
		int n = 3;
		int k = 2;
		printSequences(n, k);
	}
}

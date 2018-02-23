
public class QuickSort 
{
	public int[] a;
	
	public void quicksort(int[] array, int low, int high)
	{
		a = array;
		int i = low, j = high;
		int pivot = a[(low + high) / 2];
		while (i <= j)
		{
			while (a[i] < pivot)
			{
				i++;
			}
			while (a[j] > pivot)
			{
				j--;
			}
			if (i <= j)
			{
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
		{
			quicksort(a, low, j);
		}
		if (i < high)
		{
			quicksort(a, i , high);
		}
	}
	
	public void swap(int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args)
	{
		QuickSort q = new QuickSort();
		int a[] = { 10, 1, 6, 4, 7, 9, 2 };
		System.out.println("Before sorting: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		q.quicksort(a,  0,  a.length - 1);;
		System.out.println("After Sorting: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}

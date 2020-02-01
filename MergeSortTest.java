import java.util.*;
public class MergeSortTest {

	public static void main(String[] args) {
		int a[]={3,5,2,9};
		int b[]={8,7,4,1};
		int t=a.length+b.length;
		System.out.println("t = "+t);
		int c[]= new int [t];
		int i,j=0,k=0;
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		System.out.println("i = "+i);
		for(j=i;j<c.length;j++)
		{
			c[j]=b[k];
			k++;
		}
		int temp=0;
	    for(i=0;i<c.length-1;i++)
	    {
	    	for(j=0;j<c.length-1;j++)
	    	{
	    		if(c[j]>c[j+1])
	    		{
	    			temp=c[j];
	    			c[j]=c[j+1];
	    			c[j+1]=temp;
	    		}
	    	}
	    }
		System.out.println("Merge Sort Array  : ");
		for(i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"\t");
		}
	}

}

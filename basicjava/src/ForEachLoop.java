
public class ForEachLoop {
	
	public static void main(String args[]){  
		
			
		
		int table []={2,4,6,8,10};//declaration, instantiation and initialization  
		//printing array  
		/*
		 * for(int i=0;i<a.length;i++)//length is the property of array
		 * System.out.println(a[i]);
		 */ 
		for(int i:table)  
			System.out.println(i);
		System.out.println(table.length);
}
}

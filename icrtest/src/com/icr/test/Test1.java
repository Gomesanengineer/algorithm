package com.icr.test;

public class Test1 {
	public static void main(String[] arg) {
		//int a[] = { 2, 1, 6, 4, 3, 5 };
		//int b[] = { 4, 2, 1, 3, 6, 5 };

		
		/*int a[] = { 12, 11, 16, 140, 13, 15 };
		int b[] = { 140, 12, 11, 13, 16, 15 };
		*/
		int a[] = {3, 6, 4, 8, 22, 9, 1, 7, 15, 10}; 
		int b[] = {4, 6, 8, 3, 1, 7, 9, 10, 15, 22};
		
		int count =0;
		int countj = 0;
		if (a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				count++;
				if(a[i]!=b[i]) {
					
					int j=i;
					
					while(a[i] != b[j]) {
						System.out.print("inner loop ");
						countj++;
						System.out.println("countj : "+countj);
						j++;
						if(j>=b.length) {
							System.out.println("No value found : "+a[i]);
							j=i;
							break;
							
						}
					}
					
					if(a[i] == b[j]) {
						int temp = b[j];
						b[j] = b[i];
						b[i] = temp;
					}
				}		
			}
		}
		
		System.out.println("count : "+count + ":: countj : "+countj);
		System.out.println(a.length+"::"+b.length);
		for(int i=0;i<b.length;i++) {
			System.out.println("a : "+a[i]+":: b : "+b[i]);
		}

	}

}

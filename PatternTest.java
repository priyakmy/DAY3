class PatternTest
{
	public static void main(String args[]){
		int i,j,k;
		
		
		// RECTANGLE PATTERN
		for(i=1;i<=4;i++)
		{
		 for(j=1;j<=4;j++)
		 {
		 System.out.print(  "*" );
		 }
		  System.out.println();
		 }
		  	  System.out.println("----------------------------------------------------");
			  
		  	  System.out.println("----------------------------------------------------");
	//HALLOW RECTANGELE PATTERN
	int n=5;
			for(i=1;i<n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(i ==n/2+1 || j==n/2+1 )
					
						System.out.print("* ");
			else
					System.out.print(" ");
				}
					System.out.println();
				
				}
			
			//LINE PATTERN
			
		  	  System.out.println("----------------------------------------------------");
			  
		  	  System.out.println("----------------------------------------------------");
			
	for(i=1;i<5;i++)
			{
				for(j=1;j<=5;j++)
				{
					if(i==j && j==i )
					{
						System.out.print("*");
				}
				
				else{
					System.out.print("");
				   }
			}  
					System.out.println();
				
			}
			//DrawPyramidOfstars
			   System.out.println("Pyramid pattern in stars ");
			
			for ( i = 0; i < 5; i++)  
			{ 
		for ( j = 0; j < 5 - i; j++)
			{ System.out.print(" "); 
		} for ( k = 0; k <= i; k++)
			{ System.out.print("* "); 
		} System.out.println(); 
		} 
			
			
	//DrawPyramidOfNumbers
 	 
	   System.out.println("Pyramid pattern in numbers ");
	for ( i = 0; i < 5; i++) 
	{ 
     for ( j = 0; j < 5 - i; j++)
		 { System.out.print(" ");
	 } 
	 for ( k = 0; k <= i; k++) 
	 { 
     System.out.print(k + " "); 
	 }
	 System.out.println(); 
	 
	 } 
	  }
	   }

	
	
	
	
	
	
	
	
	
	


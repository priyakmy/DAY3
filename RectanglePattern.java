class RectanglePattern{
		static void Rectangle(int rows, int column){
	
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=column;j++)
			{
					
						System.out.print("* ");
		
				}
					System.out.println();
				
				}
	}
		
	static void HallowRectangle(int rows, int column){              
	
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=column;j++)
			{
					if(i==1 || i==rows-1 || j==1 || j==column-1)
					{
						System.out.print(" * ");
						else{
							System.out.print(" ");
		
				}
			}
					System.out.println();
				
				}
	}
	  public static void main(String args[])
        {
            int rows = 4, column=12;
				System.out.println("STAR RECTANGLE");
            Rectangle(rows, column); 
			
			System.out.println("HALLOW STAR RECTANGLE");
			HallowRectangle(rows, column);
			
	}
	
}

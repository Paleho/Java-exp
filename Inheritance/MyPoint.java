public class MyPoint
{
	private int xCoord;
	private int yCoord;

	public MyPoint(int x, int y)
	{
		xCoord = x;
		yCoord = y;
	}

	public int getX()
	{
		return xCoord;
	}

	public int getY()
	{
		return yCoord;
	}

	public String toString()
	{
		return "Point("+xCoord+","+yCoord+")";
	}

	public void draw()
	{
		int i;
		for (i=1;i<=yCoord;i++)
			System.out.println();
		for (i=1;i<=xCoord;i++)
			System.out.print(" ");
		System.out.println("*");
}
}

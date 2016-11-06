package data;

public class Point {

	private int X;
	private int Y;
	
	public Point ()
	{
		this.setY(0);
		this.setX(0);
	}
	
	public Point (int x,int y)
	{
		this.setX(x);
		this.setY(y);
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		this.Y = y;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		this.X = x;
	}
	public void infoShow()
	{
		System.out.println("Wartoœæ wspó³¿êdnej X : "+ this.getX()+ " wspó³¿edna Y: "+this.getY() );
	}
	
	
}

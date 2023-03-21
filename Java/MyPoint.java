package Enabling;


public class MyPoint
{
    private int x, y;

    public MyPoint()
    {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

    public double distance(int x, int y)
	{
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}

	public double distance(MyPoint another)
	{
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
        double d = Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		return d;
	}

    public String printCoordinates()
	{
		return "(" + this.x + ", " + this.y + ")";
	}

    class PointTest {
        public static void main(String[] args) {
            MyPoint p1 = new MyPoint(0,0); //default constructor daw
            MyPoint p2 = new MyPoint(10,11); //give x and y sooo 2 textfield para kunin?
            
            System.out.println(p1.distance(p2)); //eto ung pupunta sa method distance
            System.out.print(p2.printCoordinates()); //not editable text field ng given
        }
    }
}
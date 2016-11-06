import data.Point;
import logic.PointController;


public class Application {
		public static void main(String a[])
		{
			Point p =new Point(2,1);
			PointController pcon= new PointController();
			p.infoShow();
			pcon.addX(p);
			p.infoShow();
			pcon.addY(p);
			p.infoShow();
			pcon.addX(p);
			p.infoShow();
			pcon.addY(p);
			p.infoShow();
			pcon.minusX(p);
			p.infoShow();
			pcon.minusY(p);
			
			if (p.getX()==3&&p.getY()==2)
			{
				System.out.println("test true");
			}
			else
				System.out.println("test false");
		}
}

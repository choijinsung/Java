import java.util.*;
import java.awt.*;

public class r
{
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(5, 10, 20, 30);
		Rectangle rect2 = new Rectangle(10, 20, 30, 15);
		Rectangle rect3 = new Rectangle(20, 30, 45, 10);

		ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		list.add(rect1);
		list.add(rect2);
		list.add(rect3);

		class RectangleComparator implements Comparator<Rectangle>
		{
			public int compare(Rectangle r1, Rectangle r2)
			{
				if(r1.getWidth()*r1.getHeight() < r2.getWidth()*r2.getHeight())
					return -1;
				else if(r1.getWidth()*r1.getHeight() > r2.getWidth()*r2.getHeight())
					return 1;
				else
					return 0;
			}
		}
	
		RectangleComparator comp = new RectangleComparator();

		Collections.sort(list, comp);

		for(Rectangle r : list)
			System.out.println(r.getWidth() + " " + r.getHeight());
	}
}
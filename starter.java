import javax.swing.JFrame;

public class starter
{		
        public static void main(String args[])
        {
			Shape window = new Shape("Rectangle");
			placeFinder p = new placeFinder();
			window.getContentPane().addMouseListener(p);
		}	
}
 
import javax.swing.JFrame;

public class starter
{		
        public static void main(String args[])
        {
			JFrame window = new JFrame("Test");
			
			window.setSize(600,600);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
			
			placeFinder p = new placeFinder();
			window.getContentPane().addMouseListener(p);
		}	
}

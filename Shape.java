import java.awt.Graphics;
import javax.swing.JFrame;
public class Shape extends JFrame
{		
	public Shape(String title){
		JFrame window = new JFrame(title);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.drawRect(50,50,50,50);
	}
		
}
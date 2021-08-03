import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyPanel extends JPanel implements ActionListener{
	
	
	final int panel_WIDTH =500;
	final int panel_HEIGHT =500;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity =3;
	int yVelocity =1;
	int x = 0;
	int y =0;
	MyPanel(){
		
		this.setPreferredSize(new Dimension(panel_WIDTH,panel_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("pixel.png").getImage();
		backgroundImage = new ImageIcon("spc.jpeg").getImage();
		timer = new Timer(10,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		
		Graphics2D g2D = (Graphics2D)g;
		
		g2D.drawImage(backgroundImage,0,0,null);
		g2D.drawImage(enemy,x,y,null);
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x>= panel_WIDTH-enemy.getWidth(null)|| x<0) {
			xVelocity = xVelocity*-1;
			
		};
		x = x+ xVelocity;
		
		

		if(y>= panel_HEIGHT-enemy.getHeight(null)|| y<0) {
			yVelocity = yVelocity*-1;
			
		};
		y = y+ yVelocity;
		repaint();
		
		
	}

}

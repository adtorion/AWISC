import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class block extends GameObject{

	public block(int x, int y, ID id) {
		super(x, y, id);
	
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 32, 32);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
		
	}

}

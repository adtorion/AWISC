import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Crate extends GameObject{

	public Crate(int x, int y, ID id) {
		super(x, y, id);
	}

	
	public void tick() {
		
	}

	
	public void render(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 32, 32);
	}

	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

}

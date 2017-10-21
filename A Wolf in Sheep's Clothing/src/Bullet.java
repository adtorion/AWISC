import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bullet extends GameObject{
	
	private Handler handler;
	
	public static int velX = 20;
	public static int velY = 20;

	public Bullet(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
		velX = 20;
		velY = 20;
	}


	public void tick() {
		
		x += velX;
		y += velY;
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Block){
				if(getBounds().intersects(tempObject.getBounds())){
					handler.removeObject(this);
				}
			}
		}
		
	}


	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 8, 8);
	}

	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 8, 8);
	}

}

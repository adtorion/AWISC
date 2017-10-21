import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Soldier extends GameObject{
	
	private Handler handler;
	Game game;

	public Soldier(int x, int y, ID id, Handler handler, Game game) {
		super(x, y, id);
		this.handler = handler;
		this.game = game;
		
	}

	public void tick() {
		x += velX;
		y += velY;
		
		collision();
		
		//movement
		if(handler.isUp()) velY = -5;
		else if(!handler.isDown()) velY = 0;
		
		if(handler.isDown()) velY = 5;
		else if(!handler.isUp()) velY = 0;
		
		if(handler.isRight()) velX = 5;
		else if(!handler.isLeft()) velX = 0;
		
		if(handler.isLeft()) velX = -5;
		else if(!handler.isRight()) velX = 0;
		
		if(handler.isRun()){
			if(handler.isUp()) velY = -8;
			else if(!handler.isDown()) velY = 0;
			
			if(handler.isDown()) velY = 8;
			else if(!handler.isUp()) velY = 0;
			
			if(handler.isRight()) velX = 8;
			else if(!handler.isLeft()) velX = 0;
			
			if(handler.isLeft()) velX = -8;
			else if(!handler.isRight()) velX = 0;
		}
		
		if(handler.isShootUp()) {
			
			Bullet.velX = 0;
			Bullet.velY = 20;
			
			for(int i = 0; i < handler.object.size(); i++){
		
			GameObject tempObject = handler.object.get(i);
			
				if(tempObject.getId() == ID.Player && game.ammo >= 1){
					handler.addObject(new Bullet(tempObject.getX() + 16, tempObject.getY() + 24, ID.Bullet, handler));
					game.ammo--;
				}
			}			
		}
		
		if(handler.isShootDown()) {}
		
		if(handler.isShootLeft()) {}
		
		if(handler.isShootRight()) {}
	}
	
	private void collision(){
		for(int i = 0; i < handler.object.size(); i++){
			
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Block){
				
				if(getBounds().intersects(tempObject.getBounds())){
					x += velX * -1;
					y += velY * -1;
				}
				
			}
			
			if(tempObject.getId() == ID.Crate){
				
				if(getBounds().intersects(tempObject.getBounds())){
					game.ammo += 20; 
					handler.removeObject(tempObject);
				}
				
			}
	
		}
	}

	public void render(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillRect(x, y, 32, 32);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}

}

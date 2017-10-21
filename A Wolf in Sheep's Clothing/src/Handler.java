import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	private boolean up = false, down = false, right = false, left = false, run = false, shootUp = false, shootDown = false, shootRight = false, shootLeft = false;
	public void tick(){
		for(int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
		
	}
	
	public void render(Graphics g){
		for(int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
		
	}
	
	public void addObject(GameObject tempObject){
		object.add(tempObject);
	}
	
	public void removeObject(GameObject tempObject){
		object.remove(tempObject);
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
		
	}
	
	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
		
	}
	
	public boolean isShootUp() {
		return shootUp;
	}

	public void setShootUp(boolean shootUp) {
		this.run = shootUp;
		
	}

	public boolean isShootDown() {
		return shootDown;
	}

	public void setShootDown(boolean shootDown) {
		this.run = shootDown;
		
	}
	public boolean isShootRight() {
		return shootRight;
	}

	public void setShootRight(boolean shootRight) {
		this.run = shootRight;
		
	}
	
	public boolean isShootLeft() {
		return shootLeft;
	}

	public void setShootLeft(boolean shootLeft) {
		this.run = shootLeft;
		
	}
}

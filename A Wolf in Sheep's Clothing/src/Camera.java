
public class Camera {

	private float x, y;
	
	public Camera(float x, float y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public void tiick(GameObject object){
		
		x += ((object.getX() - x) - 1000/2) * 0.05f;
		y += ((object.getY() - y) - 563/2) * 0.05f;
		
		if(x <= 0) x = 0;
		if(x >= 1052) x = 1052;
		if(y <= 0) y = 0;
		if(y >= 563+52) y = 563+52;
		
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	
}

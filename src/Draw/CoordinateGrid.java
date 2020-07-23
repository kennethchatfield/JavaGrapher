package Draw;

public class CoordinateGrid {
	
	private Coordinate origin = new Coordinate();
	private Coordinate axis = new Coordinate(100, 100);
	
	public CoordinateGrid() {
	}
	public CoordinateGrid( Coordinate axis ) {
		this.axis = axis;
	}
	public CoordinateGrid( Coordinate axis, Coordinate origin ) {
		this.axis = axis;
		this.origin = origin;
		
	}
	public CoordinateGrid( int axisX, int axisY ) {
		this.origin = new Coordinate();
		this.axis = new Coordinate(axisX, axisY);
		
	}
	public CoordinateGrid( int axisX, int axisY, int originX, int originY ) {
		this( axisX, axisY );
		this.origin = new Coordinate(originX, originY);
		
	}
	public void setAxis(Coordinate axis) {
		this.axis = axis;
	}
	public void setAxis(int xValue, int yValue) {
		this.axis.setX(xValue);
		this.axis.setY(yValue);
	}
	public void setOrigin(Coordinate origin) {
		this.origin = origin;
	}
	public void setOrigin(int xValue, int yValue) {
		this.origin.setX(xValue);
		this.origin.setY(yValue);
	}

	public Coordinate getAxis() {
		return this.axis;
	}
	public Coordinate getOrigin() {
		return this.origin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

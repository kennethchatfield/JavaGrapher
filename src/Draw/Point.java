package Draw;

public class Point extends Element {
	
	private double value = 0.0;
	private String label;
	
	public Point() {
		super();
	}
	public Point( double value ) {
		super();
		this.value = value;
	}
	public Point( double value, String label ) {
		super();
		this.value = value;
		this.label = label;
	}
	
	public void setLabel( String label ) {
		this.label = label;
	}
	public String getLabel( ) {
		return this.label;
	}
	
	public void setValue( double value ) {
		this.value = value;
	}
	public double getValue( ) {
		return this.value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


public class PolygonArea {

	private int height;

	public PolygonArea() {
	}

	public int areaShape( int n ) {

		this.height = n + ( n - 1 );
		int total = 0;
		int iterator = 0;

		iterator = this.height;

		for ( int i = 0; i < ( this.height - n ); i++ ) {
			iterator = iterator - 2;
			total += iterator;
		}

		return total * 2 + this.height;
	}

	public int getHeight() {
		return this.height;
	}

}

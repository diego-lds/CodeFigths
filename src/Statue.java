public class Statue {

	public int makeArrayConsecutive2( int[] statues ) {

		int menor = 0;
		int maior = 0;

		for ( int i = 0; i < statues.length; i++ ) {
			if ( statues[i] < menor || i == 0 ) {
				menor = statues[i];
			}
			if ( statues[i] > maior || i == 0 ) {
				maior = statues[i];
			}

		}

		return ( ( maior - menor ) - statues.length ) + 1;
	}
}

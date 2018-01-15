public class AlmostIncreasingSequence {

	static boolean almostIncreasingSequence( int[] sequence ) {
		for ( int i = 0; i < sequence.length; i++ ) {

			//IDEIA passar a iimplementação de isIncrementa para o mesmo for() evitando a iteração

			int[] array = withdrawElement( sequence, i );
			if ( isIncremental( array ) ) {
				return true;
			}

		}
		return false;
	}

	static int[] withdrawElement( int[] sequence, int index ) {

		int[] array = new int[sequence.length - 1];

		int j = 0;

		for ( int i = 0; i < sequence.length; i++ ) {
			if ( index == i ) {
				continue;
			} else {
				array[j] = sequence[i];
			}
			j++;
		}

		return array;
	}

	static boolean isIncremental( int[] sequence ) {

		for ( int i = 0; i < sequence.length - 1; i++ ) {
			if ( sequence[i + 1] <= sequence[i] ) {
				return false;
			}
		}
		return true;
	}

}

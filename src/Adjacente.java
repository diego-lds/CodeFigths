
public class Adjacente {

	public static int adjacentElementsProduct( int[] inputArray ) {

		int maiorProduto = 0;

		for ( int i = 0; i < inputArray.length - 1; i++ ) {

			int mult = inputArray[i] * inputArray[i + 1];

			if ( ( mult > maiorProduto || i == 0 ) ) {
				maiorProduto = mult;
			}
		}

		return maiorProduto;
	}

}

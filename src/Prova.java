public class Prova {

	double Nota;

	void calcularNotaTotal( double ProvaA1, double ProvaA2, double ProvaB1, double ProvaB2 ) {
		if ( ProvaA1 <= 5 && ProvaA2 <= 5 && ProvaB1 <= 5 && ProvaB2 <= 5 ) {
		} else {
			System.out.print( "Média errada" );
		}
		this.Nota = ( ( ProvaA1 + ProvaA2 ) + ( ProvaB1 + ProvaB2 ) );
	}
}

public class ProgramFluxeControl {

	public static void main(String[] args) {
		//if()/else clause 
		int year_old = 20;
		if( year_old <= 12 ) {
			System.out.println("Criança");
		}
		if( year_old > 12 && year_old <= 19 ) {
			System.out.println("Adolescentes");
		}
		if( year_old > 19 && year_old <= 60) {
			System.out.println("Adulto");
		}
		if(year_old > 60 ) {
			System.out.println("Idoso");
		}
		
		//if()/else 2 clause
		
		int year_old = 20;
		if( year_old <= 12 ) {
			System.out.println("Criança");
		}
		else if( year_old <= 19 ) {
			System.out.println("Adolescentes");
		}
		else if( year_old <= 60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
		
		//switch clause
		int number = 1;
		switch(number) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		case 4 :
			System.out.println("NONE");
			break;
		}
		
		//while() loop
		int i = 0;
		//while() loop with defined code block 
		while( i < 10 ) {
			System.out.println("Line" + i);
			i++;
		}
		
		//do/while() loop
		int i = 0;
		//do/while() with defined code block
		do {
			System.out.println("Line" + i);
			i++;
		}while( i < 10 );
		
		//for loop
		for(int i=0; i < 10; i++) {
			System.out.println("Line" + i);
		}
		
		//enhanced for loop
		for (String s : args) {
			System.out.println("Arguments: " + s);
		}
		
		List lista = new ArrayList();
		//add itens for list
		for( String s : lista ) {
			System.out.println( s );
		}
		
		//break clause
		char letters[] = ( 'A','B','C','D','E' );
		int i;
		for ( i=0; i<letras.length; i++ ) {
			if (letters[i] == "C") {
				break;
			}
		}
		System.out.println("final indice: " + i);
		
		//labeled break clause
		int j = 0, i = 0;
		main1: while( true ) {
			for (i=0; i<1000; i++) {
				if( j == 10 && i == 100)
					break main1;
			}
			j++;
		}
		
		//continue clause
		char letters[] = ('B','X','R','A','S','I','L');
		int i;
		for ( i=0; i<letters.length(); i++) {
			if( letters[i] == 'X') {
				continue;
			}
		}
		
		//labeled continue clause
		int i=0, j=0;
		main2: for( j=1; j<10; j++ ) {
			for( i=1; i<10; i++ ) {
				if( (i % j) == 0 ) {
					System.out.println( "i=" + i + "j=" + j );
					continue main2;
				}
			}
			j++;
		}
	}

}

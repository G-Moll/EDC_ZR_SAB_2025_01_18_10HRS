public class Main {
    public static void main( String[] args ) {
        if( !( 1 == 1 ) ) {
            System.out.println( "Es verdadero" );
        }
        else {
            System.out.println( "Es falso" );
        }

        // for( a : b ){}
        for( int i = 0; i < 1000000; i += 10000 ) {
            System.out.println( i );
        }
        // for( int i = 10; i > 0; i -- ) {
        //     System.out.println( i );
        // }

    }
}

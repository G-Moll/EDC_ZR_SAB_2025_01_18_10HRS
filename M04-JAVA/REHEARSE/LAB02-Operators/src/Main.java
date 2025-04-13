public class Main {
    public static void main( String[] args ) {
        // DATA TYPES: Primitive or Complex Types
        int x = 3;
        int y = 5;
        boolean b = true;
        char c = 'A';
        String ok = " OK";

        // STRING OPERATORS: Contatenation + Join Strings or Chars
        System.out.println( "\n:: STRING OPERATORS" );
        System.out.println( c + ok );
        System.out.println( "c" + "ab" );

        // ARITMETHIC OPERATORS: + / - % *
        System.out.println( "\n:: ARITMETHIC OPERATORS" );
        System.out.println( 5 + 4 ); // 9
        System.out.println( x + y );
        System.out.println( x - y );
        System.out.println( x * y );
        System.out.println( x / y );
        System.out.println( x % y );
        
        // ASSIGNMENT OPERATORS: = += /= -= %= *=
        System.out.println( "\n:: ASSIGNMENT OPERATORS" );
        int abc = 100;
        System.out.println( abc );
        abc += 20;
        // abc = abc + 20;
        System.out.println( abc );
        abc /= 2;
        System.out.println( abc );
        abc %= 12;
        System.out.println( abc );
        abc *= 100;
        System.out.println( abc );

        String text = "abc";
        System.out.println( text );
        text += "xyz";
        System.out.println( text );

        // UNARY OPERATORS: ++ --
        System.out.println( "\n:: UNARY OPERATORS" );
        int z = 0;
        System.out.println( z );
        z ++;
        System.out.println( z );
        z --;
        System.out.println( z );
        
        // TERNARY OPERATOR: ? vv : vf  ;
        // if( test ) { vv } else { vf }
        System.out.println( "\n:: TERNARY OPERATORS" ); 
        String result = 1 == 2 - 11 ? "Son iguales" : "Son distintos";
        int resultTwo = 1 == 2 - 11 ? 10 : 20 ;
        System.out.println( result );
        System.out.println( resultTwo );

        // RELATIONAL OPERATORS: > >= < <= == !=
        System.out.println( "\n:: RELATIONAL OPERATORS" );
        System.out.println( x > y );
        System.out.println( x >= y );
        System.out.println( x < y );
        System.out.println( x <= y );
        System.out.println( x == y );
        System.out.println( x != y );


        // LOGICAL OPERATORS: ! && (and excluyente) || (or incluyente)
        System.out.println( "\n:: LOGICAL OPERATORS" );
        int l = 1, m = 2, n = 3;
        System.out.println( l == l && m == m && n == n ); // true
        System.out.println( l == l && m == m && n != n );
        System.out.println( l == l && m != m && n != n );
        System.out.println( l != l && m != m && n != n );

        System.out.println( l == l || m == m || n == n );
        System.out.println( l == l || m == m || n != n );
        System.out.println( l == l || m != m || n != n );
        System.out.println( l != l || m != m || n != n ); // false

        System.out.println( false && true );
        System.out.println( ! false && true );

        // ACCESS OPERATOR: .
        // Access to properties or methods from objects
        System.out.println( "\n:: ACCESS OPERATORS" );

        // NEW OPERADOR: Create instances
        String s = new String( "ABC" );
        System.out.println( s );

        // Expression
        // Operadores y Operandos (Valores)
        // Calculan nuevos valores
    }
}

public class StaticMethods {
    // properties   state
    // methods      behavior
    int age;
    char gender;

    int personName( int a, int b ) {
        return a * b;
    }
    String fullName( String name, String lastname ) {
        return name + " " + lastname;
    }
    boolean isApproved( float note ) {
        return note >= 7 ? true : false ;
    }

    public static void main( String args[] ) {
        System.out.println( "Hello Joshua!!!" );
        // Run (Execute, Call, Invoke, Validate) a method
        messageSum();
        messageHello();
        messageBool();
    }

    // A static methods can be used by the current class
    public static void messageSum() {
        System.out.println( 1 + 7 );
    }
    public static void messageHello() {
        System.out.println( "Hello " + "Java" );
    }
    public static void messageBool() {
        System.out.println( 1 == 1 );
    }
}

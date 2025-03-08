public class StaticMethods {
    // properties   state
    // methods      behavior
    int age;
    char gender;

    public static void main( String args[] ) {
        System.out.println( "Hello Joshua!!!" );
        
        // Run (Execute, Call, Invoke, Validate) a method
        messageSum();
        messageHello();
        messageBool();
    }

    // Usually a void method is used for sending messages
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

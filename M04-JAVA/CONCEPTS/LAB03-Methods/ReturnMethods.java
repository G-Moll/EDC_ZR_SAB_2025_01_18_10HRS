public class ReturnMethods {
    // properties   state
    // methods      behavior
    int age;
    char gender;

    public static void main( String args[] ) {
        System.out.println( "Hello Joshua!!!" );
        
        // These functions return some value
        int amount = sum();
        String message = hello();
        boolean isOld = info();
        System.out.println( message + ", are you older than " + amount + " years..? " + isOld );
        
        // This function doesn't return something
        noMessage();
    }

    public static int sum() {
        return 3 + 7;
    }
    public static String hello() {
        return "Hello " + "Java";
    }
    public static boolean info() {
        return true;
    }

    public static void noMessage( ) {
        System.out.println( "No returned data" );
    }

}

public class ReturnMethods {
    // properties   state
    // methods      behavior
    int age;
    char gender;

    public static void main( String args[] ) {
        System.out.println( "Hello Joshua!!!" );
        
        // Every  variable holds the given data
        // returned for another method
        int amount = sum();
        String message = hello();
        boolean isOld = info();

        // then all results are stored in a new variable
        String fullMessage = message + ", are you older than " + amount + " years..? " + isOld; 
        
        // Finally a message (or more precesses are executed) is send...
        System.out.println( fullMessage );

        // Executing a method
        // that calls more methods
        caller();
    }

    // These methods return some value
    // those values are reused in some additional task
    public static int sum() {
        return 3 + 7;
    }
    public static String hello() {
        return "Hello " + "Java";
    }
    public static boolean info() {
        return true;
    }

    // The void methods usually
    // calls other methods
    // and/or send some message
    public static void caller( ) {
        System.out.println(
            "\nPRITING MANY RESULTS\n" +
            "sum() result: " + sum() + "\n" +
            "hello() result: " + hello() + "\n" +
            "info() result: " + info()
    );
    }

}

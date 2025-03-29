import com.rdk.models.Address;
import com.rdk.models.User;

class Main {
    public static void main(String[] args) {        
        // Instances: copies from classes

        // Address instances
        Address addressOne = new Address( 1, "Liverpool", "54", "Mexico" );
        System.out.println( addressOne.describeAddress() );
        
        Address addressTwo = new Address( 2, "Nuevo Leon", "15", "Francia" );
        System.out.println( addressTwo.describeAddress() );

        Address addressBis = new Address( 3, "Tamaulipas", "30", "EU" );
        System.out.println( addressBis.describeAddress() );

        // User instances
        User userOne = new User( 1, "Joshua", "Perez", 30 );
        User userTwo = new User( 2, "Paul", "Hernandez", 40 );
        User userBis = new User( 3, "Peter", "Smith", 55 );
        System.out.println( userOne.describeUser() );
        System.out.println( userTwo.describeUser() );
        System.out.println( userBis.describeUser() );
    }
}

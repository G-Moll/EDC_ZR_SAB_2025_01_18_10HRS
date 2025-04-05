import com.rdk.models.User;

class Main {
    public static void main(String[] args) {        
        User userOne = new User( 1, "Joshua", "Perez", 30 );
        System.out.println( userOne.describeUser() );
        userOne.registerAddress( "Home", "Liverpool", "154", "MX" );
        userOne.registerAddress( "Job", "Londres", "20", "MX" );
        System.out.println( userOne.addresses[ 1 ].describeAddress() );
        System.out.println( userOne.addresses[ 0 ].describeAddress() );
        
        User userTwo = new User( 2, "Paul", "Hernandez", 40 );
        System.out.println( userTwo.describeUser() );
        userTwo.registerAddress( "Home", "Puebla", "14", "MX" );
        userTwo.registerAddress( "Job", "Frontera", "28", "MX" );
        System.out.println( userTwo.addresses[ 0 ].describeAddress() );
        System.out.println( userTwo.addresses[ 1 ].describeAddress() );
        
        User userBis = new User( 3, "Peter", "Smith", 55 );
        System.out.println( userBis.describeUser() );
        userBis.registerAddress( "Home", "Aztecas", "18", "MX" );
        userBis.registerAddress( "Job", "Mayas", "38", "MX" );
        System.out.println( userBis.addresses[ 0 ].describeAddress() );
        System.out.println( userBis.addresses[ 1 ].describeAddress() );
   
    }
}

public class PoolPuzzleOne {
    public static void main(String [] args) {
        int x = 0;
        while ( x < 4) {
            if ( x < 1) {
                System.out.print("a");
            }
            x = x + 3;
            if ( x > 0) {
                System.out.print(" ");
                x = x - 1;
            }
            if( x == 1) {
                System.out.print("noise");
            }
            if( x > 1) {
                System.out.print("annoys");
            }


            System.out.println("");
            
        } // end while loop
    } // end main
} // end class
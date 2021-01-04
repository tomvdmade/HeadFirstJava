class Hobbits {
    String name;    

    public static void main(String[] args) {
        
        Hobbits [] h = new Hobbits[3];
        int z = -1;

        while ( z < 4) {
            z = z + 1;
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if ( z == 1) {
                h[z].name = "frodo";
            } // end of if
            if ( z == 2) {
                h[z].name = "sam";
            } // en of 2nd if
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        } // end of while loop
    } // end of main
}
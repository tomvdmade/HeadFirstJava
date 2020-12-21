public class p10 {

    public static void main (String[] args) {
        int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.print(" x is " + x);
		
		while (x > 12) { 
			x = x - 1;
			System.out.print( " x is now " + x);
		}
		

		for ( x = 0; x < 10; x = x + 1) {
			System.out.print(" x is now " + x);
		}

		if ( x == 10) {
			System.out.print(" x must be 10");
		} else {
			System.out.print(" x isn't 10");
		}
		if ((x < 3) & (name.equals(" Dirk "))); { 
			System.out.println(" Gently ");
		}
		System.out.print( " this line runs no matter what ");
		
				// this is a comment
	}
}

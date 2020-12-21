class TapeDeck { 
    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    } // end void

    void recordTape() { 
        System.out.println("tape recording");
    } // end void
} // end class

class TapeDeckTestDrive { 
    public static void main(String[] args) {

        TapeDeck t = new TapeDeck();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) { 
            t.recordTape();
        } // end if
    } // end main
} // end class
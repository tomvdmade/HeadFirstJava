class DrumKit {
    
    boolean topHat = true;
    boolean snare = true;

    void playSnare () { 
        System.out.println("bang bang ba-bang");
    } // end method snare

    void playTopHat () { 
        System.out.println("ding ding da-ding");
    } // end method tophat
} // end class

class DrumKitTestDrive {
    public static void main(String[] args) { 
        DrumKit d = new DrumKit();
        d.snare = false;

        d.playSnare();
        d.playTopHat();


        if (d.snare == true) { 
            d.playSnare();
        } // end if
    } // end main
} // end class
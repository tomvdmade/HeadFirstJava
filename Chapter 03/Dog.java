class Dog { 
    String name;
    public static void main(String[] args) {
    
        //make dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart";

    // now make a Dog array
    Dog[] myDogs = new Dog[3];
    
    // and put some dogs in it
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;
   
    // access the Dogs using the array
    myDogs[0].name = "Marge";  
    myDogs[1].name = "Fred";
   
    // Hmmm.. what is myDogs[2] name?
    System.out.print("last dog's name is ");
    System.out.println(myDogs[2].name);
    
    // now loop through the array
    // and tell all the dogs to bark
    int x = 0;
    while ( x < myDogs.length) { 
        myDogs[x].bark();
        x = x + 1;
    } // end of while loop
    } // end main
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    public void eat(){ }
    public void chaseCat(){ }

} // end class
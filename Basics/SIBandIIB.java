class ClassA {
    static {
        System.out.println("Printing from Static Instantiation Block");
    }
    {
        System.out.println("Priting from IIB");
    }
}

class SIBandIIB {
    static {
        System.out.println("Main Printing from Static Instantiation Block");
    }
    {
        System.out.println("Main Priting from IIB");
    }
    public static void main(String[] args) {
        System.out.println("Printing from Main Method");
        ClassA classA = new ClassA();
    }   
}
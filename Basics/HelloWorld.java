class ClassA {

    public void method() {

        System.out.println("Method Called of Class A");

    }

}

class HelloWorld {

    public static void main(String... args) {

        ClassA classA = new ClassA();
        classA.method();
        System.out.println("Hello World");

    }

}
class SuperClassOne {
    int i;
    static void method1(String arg) {
        System.out.println("From SuperClassOne");    
    }
}

class SuperThis {
    static {
        //System.out.println(super.i);
        //this.method2();
    }
    static void method2() {
        //super.method1();
        //this.method1();
    }
    public static void main(String[] args) {
        SuperClassOne.method1("Hello");
        SuperThis.method2();
    }
}
//Note :
// Super and This cannot be used in a static method.
package ups;
class cons_accessparent {
	cons_accessparent() {
        System.out.println("Animal constructor");
    }
}

class Dog extends cons_accessparent {
    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
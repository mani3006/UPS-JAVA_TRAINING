package ups;
class const_accparvar {
	
    String name = "Parent";
}

class Student extends const_accparvar {
    String name = "Child";

    void display() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
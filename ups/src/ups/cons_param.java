package ups;

class cons_param {
    int id;
    String name;
    double salary;

    cons_param(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
    	cons_param e = new cons_param(101, "Manisha", 25000);
        e.display();
    }
}
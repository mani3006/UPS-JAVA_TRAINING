package ups;

class this_key {
    String name;

    this_key(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
    	this_key s = new this_key("Manisha");
        s.display();
    }
}
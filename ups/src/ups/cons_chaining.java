package ups;

class cons_chaining {
    String brand;
    int price;

    cons_chaining() {
        this("Samsung", 15000);
    }

    cons_chaining(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
    	cons_chaining m = new cons_chaining();
        m.display();
    }
}
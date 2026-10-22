package ups;
class cons_task7 {

	cons_task7 getObject() {
        return this;
    }

    void display() {
        System.out.println("Calculator method called");
    }

    public static void main(String[] args) {
    	cons_task7 c = new cons_task7();
        c.getObject().display();
    }
}
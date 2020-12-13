class Animal{
    public Animal(){
        System.out.println("Animal constr called");
    }
    public void move(){
        System.out.println("Animal move called");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Dog constr called");
    }
    public void move(){
        System.out.println("Dog move called");
    }
}

class Animal_Dog{
    public static void main(String[] args) {
        Animal b = new Dog();
        b.move();
    }
}

package javaClassesAndObjects;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private String color;

    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public int getAge(){
        return this.age;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        return ("Name is: "+this.getName()+
                "\n Breed is: "+this.getBreed()+
                "\n Age is: "+this.getAge()+
                "\n Color is: "+this.getColor());
    }

    public static void main(String[] args) {

        Dog tuffy = new Dog("tuffy", "labrador", 5, "brown");
        System.out.println(tuffy.toString());
    }
}

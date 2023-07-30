/*Write a Java program to create a class called "Person" with a name and age 
attribute. Create two instances of the "Person" class, set their attributes 
using the constructor, and print their name and age.*/
class Person{
    String name;
    int age;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
public class Practice1{
    public static void main(String[] args){
        Person person1=new Person();
        Person person2=new Person();
        person1.name="Tom";
        person1.age=19;
        person2.name="Bob";
        person2.age=45;
        String name1=person1.getName();
        int age1=person1.getAge();
        String name2=person2.getName();
        int age2=person2.getAge();
        System.out.println(name1+","+age1);
        System.out.println(name2+","+age2);
    }
}

package org.example;

public class Person{
    String firstname;
    String lastName;
    int age;

    public String email;
    public String phone;
    public String address;

    public Person(String firstname,String lastName, int age ){
        this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;
        this.email="Email yok";
        this.phone="Telefon yok";
        this.address="Adres yok";
    }

    public Person(String firstname,String lastName, int age, String email, String phone, String address){
        this(firstname, lastName, age);
        this.email=email;
        this.phone=phone;
        this.address=address;

    }

    public String getFirstName(){
        return firstname;

    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return (age >=13 && age<=19);
    }

    public String getEmail()   {
        return email;
    }
    public String getPhone()   {
        return phone;
    }
    public String getAddress() {
        return address;
    }

}
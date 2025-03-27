public class Person {
    String name;
    String surname;
    double salary;

    public Person(String name, String surname, double salary) {
        this.name = name;
        this.surname=surname;
        this.salary=salary;
    }
    public String getInfo(){ return "Imię: " + name + "/ Nazwisko: "+ surname+ " wypłata: " + salary;}
    public String toString(){
        return getInfo();
    }
}
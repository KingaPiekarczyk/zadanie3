public class Hospital{
private Person[] Employees;
private int size;

public Hospital(int capacity){
    Employees=new Person[capacity];
    size=0;
}
public  void add(Person Employee){
    if(size<Employees.length){
        Employees[size]=Employee;
size++;
    }
    else {
        System.out.println("Szpital jest pełen");
    }
}
public String getInfo(){
    StringBuilder info= new StringBuilder();
    for(int i=0;i<size;i++){
        info.append(Employees[i].getInfo()).append("\n");
    }
    return info.toString();
}
}
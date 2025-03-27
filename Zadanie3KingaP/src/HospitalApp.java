public class HospitalApp {
    public static void main(String[] args){
        Hospital Hospital=new Hospital(10);
        Nurse N1=new Nurse("Anita", "Dzwon", 5400.56,4.5);
        Nurse N2=new Nurse("Maja","Niewińska",5550.5,10.5);
        Doctor D1= new Doctor("Stefan","Kowalski",1554.69,500.05);
    Hospital.add(D1);
    Hospital.add(N1);
    Hospital.add(N2);
System.out.println(Hospital.getInfo());
    }
}

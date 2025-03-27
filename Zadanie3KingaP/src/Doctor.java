public class Doctor extends Person {
    double bonus;
    public Doctor(String name,String surname, double salary, double bonus){
        super(name,surname,salary);
        this.bonus=bonus;

    }
    public String getInfo(){
        return super.getInfo()+ " bonus: "+ bonus;
    }
    public String toString(){
        return getInfo();
    }
}

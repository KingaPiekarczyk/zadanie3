public class Nurse extends Person {
    double overtime;
    public Nurse(String name,String surname,double salary,double overtime){
        super(name,surname,salary);
        this.overtime=overtime;
    }
    public String getInfo(){
        return super.getInfo()+ " nadgodziny:"+overtime;
    }
    public String toString(){
        return getInfo();
    }
}

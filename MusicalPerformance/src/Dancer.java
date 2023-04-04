// This class is to specify dancers and special attibutes
public class Dancer extends Artist{
    private String subRole;

    Dancer(String name, String subRole){
        setName(name);
        setRole("Dancer");
        this.subRole = subRole;
    }

    public void dance(){
        System.out.println(getName()+" is dancing");
    } // This is to show dancers are dancing

}

public class Dancer extends Artist{
    private String subRole;

    Dancer(String name, String subRole){
        setName(name);
        setRole("Dancer");
        this.subRole = subRole;
    }

    public void dance(){
        System.out.println(getName()+" is dancing");
    }

}

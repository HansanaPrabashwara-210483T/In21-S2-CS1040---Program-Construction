// This is the super class ffor the main artist and backup singers.
public class Singer extends Artist{
    private String subRole;  // A variable to specify the sub role of the singer.
    Singer(String name, String subRole){
        setName(name);
        setRole("Singer");
        this.subRole = subRole;
    }

    public void sing(){
        System.out.println(getName()+" is singing");
    }

}

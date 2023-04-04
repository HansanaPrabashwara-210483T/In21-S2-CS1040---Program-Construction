public class Singer extends Artist{
    private String subRole;
    Singer(String name, String subRole){
        setName(name);
        setRole("Singer");
        this.subRole = subRole;
    }

    public void sing(){
        System.out.println(getName()+" is singing");
    }

}

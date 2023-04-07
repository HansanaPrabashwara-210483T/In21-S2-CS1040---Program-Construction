// This class create instances of the back up dancers
public class BackUpDancer extends Dancer implements IBackUp{
    BackUpDancer(String name) {
        super(name, "Back Up Dancer");
    }

    public void backup(){

        System.out.println("This is the method 'backup()' in the class 'BackUpDancer'.");
        System.out.println(getName()+ " is backing up by dancing.\n");
    }
}

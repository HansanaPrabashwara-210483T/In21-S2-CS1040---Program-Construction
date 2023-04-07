// This class create instances of the backup singers.
public class BackUpSinger extends Singer implements IBackUp{
    BackUpSinger(String name){
        super(name, "Back Up Singers");
    }

    public void backup(){
        System.out.println("This is the method 'backup()' in the class 'BackUpSinger'.");
        System.out.println(getName()+ " is backing up by singing.\n");
    }
}

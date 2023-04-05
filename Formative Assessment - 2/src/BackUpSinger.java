// This class create instances of the backup singers.
public class BackUpSinger extends Singer implements IBackUp{
    BackUpSinger(String name){
        super(name, "Back Up Singers");
    }

    public void backup(){
        System.out.println(getName()+ " is backing up by singing.");
    }
}

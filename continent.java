import java.util.List;
/**
 * Created by marcrossi on 8/14/17.
 */
public class continent {
    String name;

    int reinforcementsProvided;
    boolean isOwned;
    List<region> regions;

    public continent(String n, String c, int rp, boolean owned){
        name = n;
        reinforcementsProvided = rp;
        isOwned = owned;
    }

    public void setOwned(boolean o){
        isOwned = o;
    }

    public boolean getOwned(){
        return isOwned;
    }

    public void addRegion(region r){
        regions.add(r);
    }
}
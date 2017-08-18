import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by marcrossi on 8/14/17.
 */
public class region {
    Player owner;
    int unitsPresent;

    List<Integer> adjacent;
    boolean possession;

    public region(Player o, int up, List<Integer> adj){
        owner = o;
        unitsPresent = up;
        adjacent = adj;
    }

    public void setOwner(Player o){
        owner = o;
    }

    public Player getOwner(){
        return owner;
    }

    public void setUnitsPresent(int up){
        unitsPresent = up;
    }

    public int getUnitsPresent(){ return unitsPresent; }

    public void setAdjacent(Integer an){
        adjacent.add(an);
    }

    public boolean isAdjacent(region attacker){
        for(int i : this.adjacent) {
            if(attacker.adjacent.contains(i)){
                return true;
            }
        }
        return false;
    }

    public void defend(region attacker, int howManyBattles){
        if(!this.isAdjacent(attacker)){
         return;
        }
        possession = false;
        while(howManyBattles > 0  && possession == false) {
            switch (attacker.unitsPresent) {
                case 1: break;
                case 2:
                    switch (unitsPresent) {
                        case 1:
                            compareDie(attacker, 1, 1);
                            break;
                        default:
                            compareDie(attacker, 1, 2);
                            break;
                    }
                    break;
                case 3:
                    switch (unitsPresent) {
                        case 1:
                            compareDie(attacker, 2, 1);
                            break;
                        default:
                            compareDie(attacker, 2, 2);
                            break;
                    }
                    break;
                default:
                    switch (unitsPresent) {
                        case 1:
                            compareDie(attacker, 3, 1);
                            break;
                        default:
                            compareDie(attacker, 3, 2);
                            break;
                    }
                    break;
            }
            howManyBattles--;
        }
        return;
    }

    public void compareDie(region attacker, int attackNumber, int defendNumber) {
        Random random = new Random();

        Integer[] attackArray = new Integer[attackNumber];
        Integer[] defendArray = new Integer[defendNumber];

        for(int i = 0; i < attackNumber; i++){
            attackArray[i] = random.nextInt(6) + 1;
        }

        for(int i = 0; i < defendNumber; i++){
            defendArray[i] = random.nextInt(6) + 1;
        }

        Arrays.sort(attackArray);
        List<Integer> list = Arrays.asList(attackArray);
        Collections.reverse(list);
        attackArray = (Integer[]) list.toArray();

        Arrays.sort(defendArray);
        List<Integer> list2 = Arrays.asList(defendArray);
        Collections.reverse(list2);
        defendArray = (Integer[]) list2.toArray();

        int i = 0;

        while(i < defendArray.length && i < attackArray.length){
            if(defendArray[i] >= attackArray[i]){
                attacker.unitsPresent -= 1;
                System.out.println("Defender rolls: " +defendArray[i] + " --- Attacker rolls: "+ attackArray[i] + ": Defender wins!");
            }else{
                this.unitsPresent -= 1;
                System.out.println("Defender rolls: " +defendArray[i] + " --- Attacker rolls: "+ attackArray[i] + ": Attcker wins!");
            }
            i++;
        }
        if(this.unitsPresent == 0){
            changePossession(attacker);
            possession = true;
            return;
        }
    }

    public void changePossession(region attacker){
        System.out.println("The new owner of this region is: "+ attacker.owner.name);
        this.owner.loseRegion(this);
        this.setOwner(attacker.owner);
        attacker.owner.addRegion(this);
        attacker.owner.numberOfregions++;
        attacker.owner.canReinforce = true;
        transferUnits();
    }

    public void transferUnits(){
        //prompt user for number of unit to move into this new territory
    }
}
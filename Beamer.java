
/**
 * Beamer allows user to charge a room to be teleported back whenever used
 *
 * @author Minh Quang TRAN
 */
public class Beamer extends Item
{
    private Room aChargedRoom;
    private int aNTimeUsedLeft;
    /**
     * contructeur par défaut
     * @param pItemNom
     * @param pItemDescription
     * @param pItemWeight
     * @param pChargedRoom
     */
    public Beamer(final String pItemNom, final String pItemDescription, final int pItemWeight, final Room pChargedRoom, final int pNTimeUsedLeft){
        super(pItemNom, pItemDescription, pItemWeight);
        this.aChargedRoom = pChargedRoom;
        this.aNTimeUsedLeft = pNTimeUsedLeft;
    }
    
    /**
     * charge room
     */
    public void chargeRoom(final Room pChargedRoom){
        this.aChargedRoom = pChargedRoom;
    }
    
    /**
     * @return this.aChargedRoom
     */
    public Room getChargedRoom(){
        return this.aChargedRoom;
    }
    
    
    /**
     * setUse add or subtract the amount of time the beamer can be used
     */
    public void setUse(int deltaTime){
        this.aNTimeUsedLeft += deltaTime;
    }
    
    
    /**
     * return how many time left the beamer can be used
     */
    public int getTimeUsed(){
        return aNTimeUsedLeft;
    }
    
    
    /**
     * return true if the beamer can be used, false other wise
     */
    public boolean canBeUse(){
        return aNTimeUsedLeft > 0;
    }
}
//<>
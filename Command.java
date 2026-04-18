 
/**
 * Classe Command - une commande du jeu d'aventure Zuul.
 *
 * @author Minh Quang TRAN
 */
public class Command
{
    private String aCommandWord;
    private String aSecondWord;
    /**
     * @param pSecondWord second word of the user's input
     * @param pCommandWord first word of the user's input
     */
    public Command(final String pCommandWord, final String pSecondWord){
        this.aCommandWord = pCommandWord;
        this.aSecondWord = pSecondWord;
    }//Command
    /**
     * return first word (Command word)
     * @return aCommandWord - the first word of the user's input
     */
    public String getCommandWord(){
        return this.aCommandWord;
    }//getCommandWord
    /**
     * return second word
     * @return aSecondWord - the second word of the user's input
     */
    public String getSecondWord(){
        return this.aSecondWord;
    }//getSecondWord
    /**
     * @return this.aSecondWord != null
     */
    public boolean hasSecondWord(){
        return this.aSecondWord != null;
    }
    /**
     * detect whether or not the word is valid (in class CommandWords)
     * @return this.aCommandWord == null
     */
    public boolean isUnknown(){
        if(this.aCommandWord == null){return true;}
        else{return false;}
    }//isUnknown
}
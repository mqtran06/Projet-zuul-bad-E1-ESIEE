import java.util.HashMap;
import java.util.Iterator;

/**
 * Command word, stored valid command 
 */

public class CommandWords
{
    // a constant array that will hold all valid command words
    private String[] aValidCommands = { "go", "help", "look", "quit", "eat", "back", "test", "take", "drop", "charge", "use", "map"};

    /**
     * Check whether a given String is a valid command word. 
     * return true if a given string is a valid command,
     * false if it isn't.
     * @param pString - user input
     * @return this.aValidCommands[vI].equals(pString)
     */
    public boolean isCommand(final String pString)
    {
        for(int vI=0; vI<this.aValidCommands.length; vI++){
            if ( this.aValidCommands[vI].equals( pString ))
                return true;
        } // for
        // if we get here, the string was not found in the commands :
        return false;
    } // isCommand()
    /*
     * print valid words
     * la boucle for each
     *      for ( typeElement vElement : tableau )
     *      for ( TypeElement vElement : ensemble )
     *
    
    public void showAll(){
        for(String command: aValidCommands){
            System.out.println(command + " ");
        }
    }*/
    /**
     * return all valid words without printing it like "showall" procedure
     * @return allCommand - command that we can use, can be the printed in other method such as help
     */
    public String getCommandList(){
        String allCommand = "";
        for(String command: aValidCommands){
            allCommand += command + " ";
        }
        return allCommand;
    }//getCommandList
} // CommandWords

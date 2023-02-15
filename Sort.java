package dirsort;

/**
 *
 * @author isabel
 */
public class Sort {
//FIELDS
    private String dirs;
    private int slashCount;

//CONSTRUCTOR
    Sort (String a)
    {
        dirs = a;
        slashCount = getSlashCount(a);
    }
    
//GET_SLASH_COUNT
    public int getSlashCount(String input)
    {
        int result = 0;
        for (int k = 0; k < input.length(); k++)
        {
            if (input.charAt(k) == '/')
            {
                result++;
            }
        }
        return result;
    }
    
//GET_STRING
    public String getString()
    {
        return dirs;
    }
}

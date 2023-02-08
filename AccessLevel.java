package accesslevel;
/**
 *
 * @author isabel
 */
public class AccessLevel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] example = {1,2,3,4,5,6,7,8,9};
        System.out.println(accessLevel(example, 5));
    }   
    
    public static String accessLevel(int[] rights, int minPermission)
    {
        int length = rights.length;
        String result = "";
        
        for (int k = 0; k < length; k++)
        {
            if (rights[k] >= minPermission)
            {
                result += "A";
            }
            else 
            {
                result += "D";
            }
        }
        
        return result;
    }
}
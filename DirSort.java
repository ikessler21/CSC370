package dirsort;
import java.util.*;

/**
 *
 * @author isabel
 */
public class DirSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] arrDirs = new String [50];
        List<Sort> list = new ArrayList<Sort>();
        
        for (int k = 0; k < arrDirs.length; k++)
        {
            Sort a = new Sort(arrDirs[k]);
            list.add(a);
        }
        
        list.sort(Comparator.comparing(Sort::getSlashCount).thenComparing(Sort::getString));
    }
}

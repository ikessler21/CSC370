package drawtree;

/**
 *
 * @author isabel
 */
public class DrawTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    public String[] draw(int[] parents, String[] names) {
        int rootIndex = 0, level = 1, counterSpaces = 0, counterLines = 0;
        String[] result = new String[50];

        //first find root
        for (int k = 0; k < parents.length; k++) {
            if (parents[k] == -1) {
                rootIndex = k;
            }
        }

        result[0] = "+-" + names[rootIndex];

        for (int k = 0; k < parents.length; k++) {
            if (parents[k] != -1) {
                result[k] = "  +-" + names[k];
            }
            for (int j = k + 1; j < parents.length - 1; j++) {
                result[counterLines] += "|";
            }

            for (int i = k; i < parents.length; i++) {
                counterSpaces++;
                if (parents[i] == parents[k]) {
                    for (int h = 0; h < level; h++) {
                        result[counterSpaces] += "  ";
                    }
                    result[counterSpaces] += "+-" + names[i];
                }
            }
            counterLines = counterSpaces;
            counterSpaces = 0;
            level++;
        }
        return result;
    }
}

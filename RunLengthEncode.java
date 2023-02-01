/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlengthencode;
import java.util.Scanner;
/**
 *
 * @author hsimk
 */
public class RunLengthEncode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "";
        String output = "";
        int length;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter your string:");
        input = scan.nextLine();
        length = input.length();
        
        for (int k = 0; k < length; k++)
        {
            int counter = 0;
            while ((k < length-1) && (input.charAt(k) == input.charAt(k+1)))
            {
                counter++;
                k++;
            }
            
            if (counter > 9)
            {
                output += "/" + (counter+1) + input.charAt(k);
            }
            else if (counter > 4)
            {
                output += "/0" + (counter+1) + input.charAt(k);
            }
            else
            {
                for (int i = 0; i <= counter; i++)
                {
                    output += input.charAt(k);
                }
            }
        }
        
        System.out.println(output);
    }
}

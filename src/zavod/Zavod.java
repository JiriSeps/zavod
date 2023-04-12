/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavod;

/**
 *
 * @author fiwie
 */
public class Zavod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zavodnik first = new Zavodnik("Pepa", "");
        first.setStartingNumber(1);
        first.setStartingTime(0, 0, 0);
        first.setFinishTime(1, 1, 1);
        first.getTime();
        System.out.println(first);
    }

}
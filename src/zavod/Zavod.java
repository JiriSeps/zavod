/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavod;

/**
 *
 * @author hsodo
 */
public class Zavod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zavodnik pepa = new Zavodnik("Pepa", "");
        pepa.setStartingNumber(1);
        pepa.setStartingTime(0, 0, 0);
        pepa.setFinishTime(1, 1, 1);
        pepa.getTime();
        System.out.println(pepa);
    }

}
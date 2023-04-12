/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavod;

import java.util.ArrayList;
import java.util.Arrays;
import zavod.Zavodnik;

public class Zavodnici {
    private Zavodnik[] Zavodnici;
    private int count = 0;

    public Zavodnici(int n) {
        Zavodnici = new Zavodnik[n];
    }

    public Zavodnici(Zavodnik[] Zavodnici) {
        this.Zavodnici = Arrays.copyOf(Zavodnici, Zavodnici.length);
    }

    public boolean add(Zavodnik a) {
        if (count < Zavodnici.length) {
            Zavodnici[count] = a;
            count++;
            return true;
        }
        return false;
    }

    public boolean add(String name, String surname) {
        Zavodnik a = new Zavodnik(name, surname);
        return add(a);
    }

    public void setClub(String Club, String name, String surname) {
        for (int i = 0; i < Zavodnici.length; i++) {
            if (Zavodnici[i].getName().equals(name) && Zavodnici[i].getSurname().equals(surname)) {
                Zavodnici[i].setClub(Club);
            }
        }
    }

    public void setRaceName(String raceName) {
        for (int i = 0; i < Zavodnici.length; i++) {
            Zavodnici[i].setRaceName(raceName);
        }
    }

    public void setRokNarozeni(int rok, String name, String surname) {
        for (int i = 0; i < Zavodnici.length; i++) {
            if (Zavodnici[i].getName().equals(name) && Zavodnici[i].getSurname().equals(surname)) {
                Zavodnici[i].setRokNarozeni(rok);
            }
        }
    }

    public void setStartingNumber(int number, String name, String surname) {
        for (int i = 0; i < Zavodnici.length; i++) {
            if (Zavodnici[i].getName().equals(name) && Zavodnici[i].getSurname().equals(surname)) {
                Zavodnici[i].setStartingNumber(number);
            }
        }
    }

    public void setStartingTime(int hours, int minutes, int seconds, String name, String surname) {
        for (int i = 0; i < Zavodnici.length; i++) {
            if (Zavodnici[i].getName().equals(name) && Zavodnici[i].getSurname().equals(surname)) {
                Zavodnici[i].setStartingTime(hours, minutes, seconds);
            }
        }
    }
    
    public void setStartingTimeAll(int hours,int minutes,int seconds){
        for(int i =0;i<Zavodnici.length;i++){
            Zavodnici[i].setStartingTime(hours,minutes,seconds);
        }
    }

    public void setFinishTime(int hours, int minutes, int seconds, String name, String surname) {
        for (int i = 0; i < Zavodnici.length; i++) {
            if (Zavodnici[i].getName().equals(name) && Zavodnici[i].getSurname().equals(surname)) {
                Zavodnici[i].setFinishTime(hours, minutes, seconds);
            }
        }
    }

    public int calculateTime(int racerNumber) {
        return Zavodnici[racerNumber].calculateTime();
    }

    public String toString(int i) {
        return Zavodnici[i].toString();
    }
    
    public void getWinner() {
        int temp = 6942000;
        int vyherce = 0;
        for (int i = 0; i < Zavodnici.length; i++) {
            if (Zavodnici[i].calculateTime < temp) {
                vyherce = i;
                temp = Zavodnici[i].calculateTime();
            }
        }
        System.out.println("Výherce závodu je " + Zavodnici[vyherce].toString());
    }


}


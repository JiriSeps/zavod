/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavod;


/**
 *
 * @author fiwie
 */
public class Zavodnik implements Comparable<Zavodnik> {
    private String name;
    private String surname;
    private boolean status = false; // false - bezi, true - dobehl
    private int number;
    private int time;
    private int hours;
    private int minutes;
    private int seconds;
    private int startHours;
    private int startMinutes;
    private int startSeconds;
    private int finishHours;
    private int finishMinutes;
    private int finishSeconds;
    private String club;
    private String raceName;
    private int rokNarozeni;

    public Zavodnik(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public void setRokNarozeni(int rokNarozeni) {
        this.rokNarozeni = rokNarozeni;
    }

    public void setStartingNumber(int number) {
        this.number = number;
    }

    public void setStartingTime(int hours, int minutes, int seconds) {
        this.startHours = hours;
        this.startMinutes = minutes;
        this.startSeconds = seconds;
    }

    public void setFinishTime(int hours, int minutes, int seconds) {
        this.finishHours = hours;
        this.finishMinutes = minutes;
        this.finishSeconds = seconds;
        this.status = true;
        this.time = calculateTime();
    }

    public int calculateTime() {
        int start;
        int finish;
        int cas;
        int timeInSeconds;
        start = 3600 * startHours + 60 * startMinutes + startSeconds;
        finish = 3600 * finishHours + 60 * finishMinutes + finishSeconds;
        cas = finish - start;
        timeInSeconds = cas;
        this.time = cas;
        this.hours = Math.round(cas / 3600);
        this.minutes = (cas % 3600) / 60;
        this.seconds = (cas % 3600) % 60;
        return timeInSeconds;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public String getRaceName() {
        return raceName;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isStatus() {
        return status;
    }

    public int getNumber() {
        return number;
    }

    public int getTime() {
        return time;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getStartHours() {
        return startHours;
    }

    public int getStartMinutes() {
        return startMinutes;
    }

    public int getStartSeconds() {
        return startSeconds;
    }

    public int getFinishHours() {
        return finishHours;
    }

    public int getFinishMinutes() {
        return finishMinutes;
    }

    public int getFinishSeconds() {
        return finishSeconds;
    }

    @Override
    public String toString() {
        return "Zavodnik{" + "name=" + name + ", surname=" + surname + ", status=" + status + ", number=" + number
                + ", time=" + time + ", hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds
                + ", startHours=" + startHours + ", startMinutes=" + startMinutes + ", startSeconds=" + startSeconds
                + ", finishHours=" + finishHours + ", finishMinutes=" + finishMinutes + ", finishSeconds="
                + finishSeconds + '}';
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looseCoupling;

/**
 *
 * @author lenovo
 */
public class Person {
    public static void main(String args[]){
        Transport bus1 = new Bus();
        Transport train1 = new Train();
        Travel travel = new Travel();
        travel.start(bus1);
        travel.start(train1);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package looseCoupling;

/**
 *
 * @author lenovo
 */
public class Travel {
    
    private Transport transport ;
//    public void start(Transport transport){
//        transport.start();
//    }
    //or
    public Travel(Transport transport){
        this.transport = transport;
    }
    public void start(){
        this.transport.start();
    }
}

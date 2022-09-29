/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRINCE
 */
import ch.aplu.robotsim.*;

public class Robotics_Miniproject {
   
    Robotics_Miniproject(){
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        LightSensor ls= new LightSensor(SensorPort.S3);
        r.addPart(g);
        r.addPart(ls);
        g.forward();
        g.setSpeed(100);
        while(true){
            int v =ls.getValue();
            if(v >= 1000)
                g.forward();
            if(v<1000)
                g.left();
            if(v < 100)
                g.stop();
        }
    }
     static { 
        RobotContext.setStartPosition(430,220);
        RobotContext.useBackground("sprites/yellowpath.gif");
     }
    public static void main (String args[]){
        new Robotics_Miniproject();
}}

    


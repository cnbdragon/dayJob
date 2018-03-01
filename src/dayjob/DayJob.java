/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayjob;

import java.io.Console;


/**
 * custom day job roll calculator for bend pathfinder societies house rules. 
 * total results = 
 * rollFromTable*playerLevel^1.5
 * 
 * dm gets money also 
 * dm results = 
 * (rollFromTable+100)*playerLevel^1.5
 * this is the money they get for running the game that week. 
 * @author jwulf
 */
public class DayJob {
    public static int dayJobRoll(int roll){
        int temp = 0;
        if (roll <= 5){
            temp = 1;
        } else if (roll <= 10){
            temp = 5;
        } else if(roll <= 15){
            temp = 10;
        } else if(roll <= 20){
            temp = 20;
        } else if(roll <= 25){
            temp = 50;
        } else if(roll <= 30){
            temp = 75;
        } else if(roll <= 35){
            temp = 100;
        } else if(roll <= 40){
            temp = 150;
        }
        return temp;
    }

    public static double calc(int level, int roll){
        return  (double)dayJobRoll(roll)*Math.pow(level,1.5);
    }
    public static double calcDM(int level, int roll){
        return  ((double)dayJobRoll(roll)+100)*Math.pow(level,1.5);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console cn = null;
        String roll = null;
        System.out.println("what the fuck");
        
        //try{
            cn = System.console();
            if(cn != null){
                roll = cn.readLine("Roll: ");
                roll = System.console().readLine();
                int temp = Integer.parseInt(roll);
                System.out.println("day job roll: " + Math.pow((double)dayJobRoll(temp)*5,1.5));
            }
        //}catch(Exception ex){
           // ex.printStackTrace();
        //}
    }
    
}

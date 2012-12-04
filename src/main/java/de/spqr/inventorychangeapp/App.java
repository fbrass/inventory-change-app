package de.spqr.inventorychangeapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello,\ntype \nb for Backwindow\nd for Door\ne for Engine\nf for Frontwindow\nt for Tire\nw for Wheel");
        String part = getPart(null);
        long amount=0;
        try{
            amount=EntityClient.amountOfParts(part);
        } catch(Exception e){
            System.out.println("Error: no Webservice found " + e);
        }
        System.out.println("There are "+amount+" items from "+part);
        System.out.println("What is the new Amount?");
        try{
            if(part.equals("BackWindow")){
                EntityClient.changeBackWindowAmount(newAmount());
            }
            if(part.equals("Door")){
                EntityClient.changeDoorAmount(newAmount());
            }
            if(part.equals("Engine")){
                EntityClient.changeEngineAmount(newAmount());
            }
            if(part.equals("FrontWindow")){
                EntityClient.changeFronWindowAmount(newAmount());
            }
            if(part.equals("Tire")){
                EntityClient.changeTireAmount(newAmount());
            }
            if(part.equals("Wheel")){
                EntityClient.changeWheelAmount(newAmount());
            }
        }catch(Exception e){
            System.out.println("Error: no Webservice found " +e);
        }
        System.out.println("the new amount is....");
        try{
            amount=EntityClient.amountOfParts(part);
        } catch(Exception e){
            System.out.println("Error: no Webservice found " + e);
        }
        System.out.println(amount);
        





    }
    /**
     * Method used to get the a number as Input
     * @return number
     */
    public static int newAmount(){
         try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = in.readLine();
            int newAmount=Integer.parseInt(line);
            return newAmount;
            
            
        } catch (Exception e) {
            System.out.println("misentry");
            return newAmount();
        }
    }

    /**
     * Method used to parse the UserInput.
     * @param part
     * @return 
     */
    public static String getPart(String part) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line = in.readLine();
            char c = line.charAt(0);

            if (c == 'b') {
                part = "BackWindow";
            }
            if (c == 'd') {
                part = "Door";
            }
            if (c == 'e') {
                part = "Engine";
            }
            if (c == 'f') {
                part = "FrontWindow";
            }
            if (c == 't') {
                part = "Tire";
            }
            if (c == 'w') {
                part = "Wheel";
            }
            if (part.equals(null)) {
                throw new Exception();
            }
            return part;
        } catch (Exception e) {
            System.out.println("misentry");
            return getPart(part);
        }
    }
}
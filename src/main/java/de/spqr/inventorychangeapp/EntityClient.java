/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.inventorychangeapp;

/**
 *
 * @author said
 */
public class EntityClient {

    
    /**
     * Method used to get the need of an order
     * @param part part to check
     * @return number of parts to order
     * @throws Exception 
     */
    public static long getOrder(String part) throws Exception {

        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.orderParts(part);

    }

    /**
     * Method used to check to amount of a car part
     * @param part part to check
     * @return number of parts
     * @throws Exception 
     */
    public static long amountOfParts(String part) throws Exception {
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.amountOfParts(part);
    }
    /**
     * Method used to change the amount of backwindows
     * @param amount new amount
     * @return 
     */
    public static boolean changeBackWindowAmount(int amount) {
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.changeBackWindowAmount(amount);
    }

    /**
     * Method used to change the amount of doors
     * @param amount new amount
     * @return 
     */
    public static boolean changeDoorAmount(int amount) {
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.changeDoorAmount(amount);
    }

    /**
     * Method used to change the amount of front windows
     * @param amount new amount
     * @return 
     */
    public static boolean changeFronWindowAmount(int amount){
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.changeFronWindowAmount(amount);
    }

    /**
     * Method used to change the amount of engines
     * @param amount new amount
     * @return 
     */
    public static boolean changeEngineAmount(int amount){
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.changeEngineAmount(amount);
    }
   
    /**
     * Method used to change the amount of tires
     * @param amount new amount
     * @return 
     */
    public static boolean changeTireAmount(int amount){
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.changeTireAmount(amount);
    }

    /**
     * Method used to change the amount of wheels
     * @param amount new amount
     * @return 
     */
    public static boolean changeWheelAmount(int amount){
        EntityServerService entityService = new EntityServerService();
        EntityServer es = entityService.getEntityServerImplPort();


        return es.changeWheelAmount(amount);
    }
}

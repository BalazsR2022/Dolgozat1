/*
* File: Controller.java
* Author: Balázs Réka
* Copyright: 2023, Balázs Réka
* Group: Szoft II/2
* Date: 2023-11-06
* Github:https://github.com/BalazsR2022/Dolgozat1.git
* Licenc: GNU GPL
*/
 




public class Controller implements Controllable{

    @Override
    public void start(){
        System.out.println("Start");
    }

    @Override
    public void stop(){
        System.out.println("Stop");
    }

    @Override
    public void restart(){
        System.out.println("Restart");

    }    public static void main(String[] args) {
    
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }
   
}





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





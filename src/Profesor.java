public class Profesor extends Thread {

    @Override
    public void run() {


                try{
                    sleep(5000);
                    System.out.println("=== Empieza la primera desinfección ===");
                    notifyAll();
                    sleep(26000);
                    System.out.println("=== Empieza la segunda desinfección ===");
                    notifyAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }



public class Profesor extends Thread {

    @Override
    public void run() {
        synchronized (Main.alumnos){
            for (int i = 0;i < 25;i++){
                Alumnos alumnoDes = new Alumnos();
                alumnoDes.setName("Alumno "+i);
                alumnoDes.start();

                Main.alumnos.add(alumnoDes);
                Main.alumnos.notify();
            }
            for (Alumnos alumnoDes:Main.alumnos){
                try{
                    alumnoDes.join();
                    sleep(1);
                    System.out.println("=== Empieza la primera desinfección ===");
                    Main.alumnos.wait();
                    Main.desinfectar();
                    Main.alumnos.notify();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

import java.util.ArrayList;

public class Main {


    public static ArrayList<Alumnos> alumnos = new ArrayList<>();

    public static void main(String[] args){
        try{
            Profesor profesor = new Profesor();
            profesor.start();
            profesor.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized static void desinfectar(){
        try{
            System.out.println("El profesor empieza a desinfectar a "+alumnos.get(0).getName());
            System.out.println(alumnos.get(0).getName()+ " desinfectando");
            Thread.sleep(1);
            alumnos.remove(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

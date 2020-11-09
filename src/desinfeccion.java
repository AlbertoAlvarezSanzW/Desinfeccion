public class desinfeccion extends Thread{
    public synchronized static void poneralaCola(Alumnos alumno){


            System.out.println("El profesor empieza a desinfectar a "+alumno.getName());
            System.out.println(alumno.getName()+ " desinfectando");


    }
}

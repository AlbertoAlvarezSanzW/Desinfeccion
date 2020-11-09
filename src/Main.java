import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Profesor profesor = new Profesor();
        profesor.start();

        for (int i = 0;i < 25;i++){
            Alumnos alumnoDes = new Alumnos();
            alumnoDes.setName("Alumno "+i);
            alumnoDes.start();
        }
    }

}

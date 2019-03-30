import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        PriorityQueue<Paciente> q = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        Boolean go = false;

        System.out.println("Se ha iniciado el programa. Bienvenido a la cola de prioridad.");
        do{
            System.out.println("Ingrese la direccion del archivo como se muestra en el ejemplo: C:\\\\Users\\\\ejemplo\\\\Desktop\\\\test.txt");
            String direccion = input.nextLine();

            try {
                File f = new File(direccion);
                BufferedReader b = new BufferedReader(new FileReader(f));
                String readLine;
                System.out.println("Pacientes encontradoes en el archivo especificado\n");
                while ((readLine = b.readLine()) != null) {
                    Paciente p = new Paciente();
                    String[] entradas = readLine.split(", ");
                    p.setNombre(entradas[0]);
                    p.setSintoma(entradas[1]);
                    p.setCodigo(entradas[2]);
                    System.out.println(p.toString());
                    q.add(p);
                }
                System.out.println("El priority queue fue llenado exitosamente.");
                go = true;
            } catch (Exception e) {
                System.out.println("No fue posible la lectura del archivo con la direccion que especifico...\nIntentelo de nuevo!");
            }
                System.out.println("La lectura del archivo fue exitosa");

        }while(!go);
        System.out.println("En seguida se despliegara en pantalla la lista ordenada de pacientes: \n");
        while(!q.isEmpty()){
            System.out.println(q.remove().toString());
        }




    }
}

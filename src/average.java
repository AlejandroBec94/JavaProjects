import java.util.Scanner;

public class average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de promedio");
        System.out.println("¿Cuantos cursos llevaste?");
        int NumCourses = input.nextInt();

        int [] Courses = new int[NumCourses];
        Double Total = 0.0;

        for (int i = 0; i < NumCourses;i++){
            System.out.println("Digita tu calificación en la clase " + i);
            Courses[i] = input.nextInt();
            Total += Courses[i];
        }

        System.out.println("Tu promedio final es de: " + (Total/NumCourses));

    }

}

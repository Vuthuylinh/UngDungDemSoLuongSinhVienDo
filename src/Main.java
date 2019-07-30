import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        float[]student;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter list student size: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size of list student shouldn't be exceed 30 ");
            }
        } while (size > 30);

        student=new float[size];
        for (int i = 0; i <student.length; i++) {
            System.out.println("Enter grade of student " + (i + 1) + ":");
            student[i] = input.nextFloat();

        }
        int count =0;
        System.out.println("List os grade: ");
        for(int i=0; i<student.length;i++){
            System.out.print(student[i]+ "; ");
            if(student[i]>=5 && student[i]<=10){
                count++;
            }
        }
        System.out.println("Total of student passed exam is: " + count);

    }

}

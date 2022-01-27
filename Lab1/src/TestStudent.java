import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Student [] team = new Student[3];
//        Student s1 = new Student(1,"Osama");
//        team[0] = s1;
//        Student s2 = new Student(2,"Mohd");
//        team[1] = s2;
//        Student s3 = new Student(3,"Qaid");
//        team[2] = s3;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < team.length; i++) {
            Student s = new Student(input.nextInt(),input.next());
            team[i] = s;
        }

        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]);
        }
    }
}

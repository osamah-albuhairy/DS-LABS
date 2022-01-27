import java.util.Arrays;

public class BackupArray {

    public static void main(String[] args) {
        int [] a = {20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        System.out.println("Backup Array : ");
        System.out.println(Arrays.toString(backupArray(a)));
    }
    public static int[] backupArray(int[] x){
        int [] backup = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            backup[i] = x[i];
        }
        return backup;
    }
}

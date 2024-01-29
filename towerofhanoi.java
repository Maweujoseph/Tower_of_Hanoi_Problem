import java.util.Scanner;

package towerofhanoi;

class towerofhanoi {
    static void toi(int n, char rodA, char rodC, char rodB) {
        if (n == 1) {
            System.out.println("Move Disk " + n + " from " + rodA + " to " + rodC);
        } else {
            toi(n - 1, rodA, rodB, rodC);
            System.out.println("Move disk " + n + " from " + rodA + " to " + rodC);
            toi(n - 1, rodB, rodC, rodA);
        }
    }

    public static int main(String[] args) {
        int number;
        System.out.println("Please enter the number of disks");
        Scanner disk = new Scanner(System.in);
        int A = disk.nextInt();
        toi(A, 'A', 'C', 'B');
    }
}

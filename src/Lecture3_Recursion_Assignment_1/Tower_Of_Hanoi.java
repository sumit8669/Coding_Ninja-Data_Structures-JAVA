package Lecture3_Recursion_Assignment_1;

public class Tower_Of_Hanoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if(disks==0)
            return;
        if (disks == 1)
        {
            System.out.println(source + " " + destination);
            return;
        }
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        towerOfHanoi(disks-1, auxiliary, source, destination);

    }
    public static void main(String[] args) {

    }
}

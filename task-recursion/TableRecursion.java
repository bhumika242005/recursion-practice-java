import java.util.*;
public class TableRecursion {
public static void printTable(int n, int i) {
if (i > 10) return;
System.out.println(n + " x " + i + " = " + (n * i));
printTable(n, i + 1);
}
public static void main(String[] args) {
int number = 5; // You can change this to any number
printTable(number, 1);
}
}
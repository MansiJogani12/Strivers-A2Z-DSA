import java.util.Scanner;

class Input_Output {
    public void printNumber(Scanner sc) {
        float a = sc.nextFloat();       
        int b = (int) a;               
        System.out.println(b);         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input_Output sol = new Input_Output();
        sol.printNumber(sc);
    }
}

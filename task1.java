//написать программу вычисления n треугольного числа

 import java.util.Scanner;
 public class task1 { 
    public static int triNum(int number) {
        if (number==1){return 1;
        }else{
           {
            return(number + triNum(number-1));
           } 
        }
    }
 
public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("введие число: ");
    if(sc.hasNextInt()){
        int number = sc.nextInt();
        System.out.printf("%d треугольное число = %d", number, triNum(number));
    }
    else {
        System.out.println("извините это не число, перезапустие программу и попробуйте снова");
    }
}
 }







       
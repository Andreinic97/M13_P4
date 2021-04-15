import java.util.*;
import java.util.Scanner;
public class Hello {
/*HOLA SOY SUSAN*/
/*HOLA SOY Reed*/
    public static void main(String[] args)
    {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(add( num1,num2));
            break;
        case 2:
            System.out.println(sub( num1,num2));
            break;     
        case 3:
            System.out.println(mult( num1,num2));
            break;
        case 4:
            System.out.println(div( num1,num2));
            break;
		case 5:
                System.out.println(restaDiv());
                break;
            case 6:
                System.out.println(areaCuadrado());
                break;
         case 7:
                System.out.println(areaRec());
                break;
            case 8:
                System.out.println(areaCirculo());
                break;
            case 9:
            System.out.println(areaTriangle(num1,num2));
            break;
        case 10:
            System.out.println(RaizCuadrada(num1));
            break;
        default:
            System.out.println("Illigal Operation");


        }
		
	public static int add(int x, int y){
        int result = x + y;
        return result;
    }
	
    public static int sub(int x, int y){
        int result = x-y;
        return result;
    }
	
	public static int mult(int x, int y){
        int result = x*y;
        return result;
    }
	
    public static int div(int x, int y){
        int result = x/y;
        return result;
    }
		public static int restaDiv(int x, int y){
        int result = x%y;
        return result;
    }
	
	public static int areaCuadrado(int x){
        int result = x*x;
        return result;
    }
	
	public static int areaRec(int x , int y){
		int result = x*y;
		return result;
	}
	
	public static areaCirculo(int x){
		int result = 3.14*(Math.pow(x, 2));
		return result;
	}
	
	public static areaTriangle(int x, int y){
		int result = (x*y)/2;
		return result;
	}

}
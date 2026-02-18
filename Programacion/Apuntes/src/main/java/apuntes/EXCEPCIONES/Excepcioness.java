package apuntes.EXCEPCIONES;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepcioness {
    public static void main(String[] args) {
provocarArithmeticException();
provocarNumberFormatException();
provocarInputMismatchException();
provocarArrayIndexOutOfBoundsException();
provocarNegativeArraySizeException();
provocarIllegalArgumentException();
}


// 1. ArithmeticException
public static void provocarArithmeticException() {
try {
int x = 5 / 0;
} catch (ArithmeticException e) {
System.out.println("ArithmeticException: " + e.getMessage());
}
}


// 2. NumberFormatException
public static void provocarNumberFormatException() {
try {
int n = Integer.parseInt("abc123");
} catch (NumberFormatException e) {
System.out.println("NumberFormatException: " + e.getMessage());
}
}


// 3. InputMismatchException
public static void provocarInputMismatchException() {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Introduce un número: ");
int num = sc.nextInt();
} catch (InputMismatchException e) {
System.out.println("InputMismatchException: " + e.getMessage());
}
}


// 4. ArrayIndexOutOfBoundsException
public static void provocarArrayIndexOutOfBoundsException() {
try {
int[] arr = {10, 20, 30};
System.out.println(arr[5]);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
}
}


// 5. NegativeArraySizeException
public static void provocarNegativeArraySizeException() {
try {
int[] arr = new int[-5];
} catch (NegativeArraySizeException e) {
System.out.println("NegativeArraySizeException: " + e.getMessage());
}
}


// 6. IllegalArgumentException
public static void provocarIllegalArgumentException() {
try {
setEdad(-3);
} catch (IllegalArgumentException e) {
System.out.println("IllegalArgumentException: " + e.getMessage());
}
}


public static void setEdad(int edad) {
if (edad < 0) {
throw new IllegalArgumentException("La edad no puede ser negativa");
}
System.out.println("Edad asignada: " + edad);
}
}
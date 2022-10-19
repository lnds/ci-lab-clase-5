package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
  public static String triangulo(int a, int b, int c) {

    if (!(a + b > c && a + c > b && b + c > a)) {
      return "error no es un triangulo";
    }
    if (a > b && a > c && esPitagorico(b, c, a)) {
      return "es un triangulo pitagorico";
    } else if (b > a && b > c && esPitagorico(a,c, b)) {
      return "es un triangulo pitagorico";
    } else if (c > a && c > b && esPitagorico(a,b,c)) {
      return "es un triangulo pitagorico";
    }
        
    if (a == b && a == c && b == c) {
      return "es un triangulo equilatero";
    }
    if (a == b || a == c || b == c) {
      return "es un triangulo isoceles";
    }
    return "es un triangulo escaleno";
  }
  
  static bool esPitagorico(int a, int b, int c) {
    return c*c == a*a + b*b;
  }
  
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}

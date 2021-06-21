public class Roots {

  public static void main(String[] args) {

    float a=6,b=11,c=-35;
    System.out.println(" Equation should be in the form of ax^2+bx+c=0");
    float determinant = b * b - 4 * a * c;
    float rrot1,root2;

    if (determinant > 0) {

      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    }
    else if (determinant == 0) {

      root1 = root2 = -b / (2 * a);
      System.out.format("root1 = root2 = %.2f;", root1);
    }
    else {
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }

  }
}
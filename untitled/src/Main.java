public class Main {
    public static void main(String[] args) {

        int nota = -1;

       if (nota >= 80) {
           System.out.println("Graduação A");
       } else if (nota < 80 && nota >= 70) {
           System.out.println("Graduação B");
       }  else if (nota < 70 && nota >= 60) {
        System.out.println("Gradução C");
       } else if (nota < 60 && nota >= 50) {
           System.out.println("Gradução D");
       } else {
           System.out.println("Essa nota é inválida");
      }
    }
}
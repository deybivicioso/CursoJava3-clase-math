import javax.swing.plaf.multi.MultiTableHeaderUI;

public class App {
    public static void main(String[] args) throws Exception {
        double variable1=45.5;
        variable1=Math.sqrt(variable1); //uso de la clase math. //
        float variable2=4.5f;
        variable2=Math.round(variable2);
        System.out.println(variable1);
        System.out.print(variable2);
        double variable3=85.76;
        int resultado=(int)Math.round(variable3); //en este ejemplo vemos la refundicion//
        System.out.println(resultado);
        double num1=7.56;
        double num2=8.23;
        int resultado2=(int)Math.pow (num1,num2); //uso de la refundicion//
        double resultado3=Math.pow(num1,num2);
        System.out.println(resultado2);
        System.out.println(resultado3);

    }
}

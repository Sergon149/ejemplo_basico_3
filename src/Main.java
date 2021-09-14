@SuppressWarnings("ConstantConditions")
public class Main {

    public static void main(String[] args) {
        leaningBooleans();
        learningChars();
        learningInt();
        learningFloat();
        System.out.println(ejer1());
        System.out.println(ejer2());
        System.out.println(ejer3());

        String texto1 = "1";
        try{
            Integer num1 = Integer.valueOf(texto1);
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    public static void leaningBooleans(){
        boolean myBoolean = true;
        System.out.print("El valor es: ");
        System.out.println(myBoolean);
        myBoolean = false;
        System.out.print("El valor ahora es: ");
        System.out.println(myBoolean);
    }

    public static void learningChars(){
        char myChar = 'a';
        System.out.print("El valor es: ");
        System.out.println(myChar);
        myChar = 'b';
        System.out.print("El valor ahora es: ");
        System.out.println(myChar);
    }

    public static void learningInt(){
        int myInt = 0;
        System.out.print("El valor es: ");
        System.out.println(myInt);
        myInt = 100;
        System.out.print("El valor ahora es: ");
        System.out.println(myInt);
    }

    public static void learningFloat(){
        float myFloat = 0.1f;
        System.out.print("El valor es: ");
        System.out.println(myFloat);
        myFloat = 100.09f;
        System.out.print("El valor ahora es: ");
        System.out.println(myFloat);
    }
    public static int ejer1(){
        int myint = 2147483647;
        return myint + 10;
    }

    public static int ejer2(){
        int myint = 5;
        return myint / 2;
    }

    public static float ejer3(){
        int myint = 4874;
        return myint / 3f;
    }
}

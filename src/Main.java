public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println(isEven(1000));
    }

    ///Checks if a number is even steven
    public static boolean isEven(int i){
        if(i == 0){

            return true;
        }
        if(i == 1){

            return false;
        }
        return isEven(i - 2);
    }
}
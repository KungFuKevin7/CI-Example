public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isEven(1000));
    }

    public static boolean isEven(int i){
        if(i == 0){

            return true;
        }
        if(i == 1){

            return false;
        }
        //System.out.println(i);
        return isEven(i - 2);
    }
}
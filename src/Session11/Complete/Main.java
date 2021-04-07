package Session11.Complete;

public class Main {
    public static void main(String[] args) {
            int n = 9;
            recursiveInt(n);
    }

    public static void recursiveInt(int n){
        if (n<=0){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        recursiveInt(n-1);
    }
}

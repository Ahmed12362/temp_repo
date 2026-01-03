public class hello {
    public static void main(String[] args) {
        int x = 2026;
        int y = 2024;
        System.out.println("The maximum is: " + x + " " + y);        
    }
    int max(int x, int y){
        if (x > y)
            return x;
        else
            return y;
    }
    int min(int x, int y){
        if (x < y)
            return x;
        else
            return y;
    }
}
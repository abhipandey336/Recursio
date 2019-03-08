public class Factor {
    public static int factorial(int number){
        if (number ==1) {
            return 1;
        }

return number * factorial(number -1);
}
//a+b-c*d   +-ab*cd

public static void main(String[] args){
        for( int i = 1; i<50; i++){
            System.out.println(i +":"+ factorial(i));
}
}
}

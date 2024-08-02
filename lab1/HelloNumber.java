public class HelloNumber{
    public static void main(String[] args){
        int i = 0;
        while (i < 10){
            int s=0;
            int k=0;
            while (k<i+1){
                s+=k;
                k+=1;
            }
        System.out.println(s);
        i+=1;
        }
    }
}
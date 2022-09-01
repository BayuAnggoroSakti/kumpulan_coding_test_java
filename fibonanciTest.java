import org.junit.jupiter.api.Test;

public class fibonanciTest {
    void cetakFibonanci(int value){
        int n1=0;
        int n2=1;
        for (int i = 0; i <= value;i++){
            if(i ==0 || i == 1)
            {
                System.out.println(i);
            }else{
                int total = n1+n2;
                n1 = n2;
                n2 = total;
                System.out.println(total);
            }
        }
    }
    void cetakFibonanci2(int n){

        for (int i = 0; i < n;i++){
           System.out.println(recursive(i));
        }
    }
    int recursive(int value){
        if (value == 0) {
            return 0;
        }
        if (value == 1 || value == 2) {
            return 1;
        }
        return recursive(value - 2)+recursive(value - 1);
        
    }

    @Test
    void TestCetak(){
        cetakFibonanci2(10);
    }
}

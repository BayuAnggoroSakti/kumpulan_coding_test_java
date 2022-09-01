import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class primaTest {
    boolean isPrima(int value){
        int temp = 0;
        for(int i = 1 ; i <= value; i++)
        {
            
            if(value % i == 0)
            {
                temp = temp+1;
            }
        }
       
        if(temp ==2)
        {
            return true;
        }else{
            return false;
        }
    }

    void cetakPrima(int value)
    {
       
        for (int i = 1 ; i <= value;i++)
        {
            int temp=0;
            for(int j = 1 ; j <= i ;j++)
            {
                if(i % j == 0)
                {
                    temp = temp+1;
                }
            }
            if (temp == 2) {
                System.out.println(i);
            }
        }
    }

    @Test
    void TestIsPrima(){
       Assertions.assertTrue(isPrima(3));
       Assertions.assertFalse(isPrima(4));
       Assertions.assertTrue(isPrima(5));
       Assertions.assertFalse(isPrima(6));
       Assertions.assertTrue(isPrima(7));
       Assertions.assertFalse(isPrima(8));
       Assertions.assertFalse(isPrima(9));
    }

    @Test
    void TestCetakPrima(){
        cetakPrima(10);
     }
}

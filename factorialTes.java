import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class factorialTes {
    int factorial(int value){
        if (value <= 0) {
            return 1;
        }
        int result = 1;
        for (int i = value; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    int recursive(int value)
    {
        if (value <= 0) {
            return 1;
        }else{
            value = value * recursive(value -1);
            return value;
        }
    }

    int tailRecursive(int total, int value){
        if (value <= 0) {
            return total;
        }
        else{
            return tailRecursive(total * value, value -1);
        }
    }

    @Test
    void tesFactorial(){
        Assertions.assertEquals(120,factorial(5));
        Assertions.assertEquals(1,factorial(0));
    }

    @Test
    void tesRecursive(){
        Assertions.assertEquals(120,recursive(5));
        Assertions.assertEquals(1,recursive(0));
    }

    @Test
    void tailecursive(){
        Assertions.assertEquals(120,tailRecursive(1, 5));
        Assertions.assertEquals(1,tailRecursive(1,0));
    }
}
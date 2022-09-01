import org.junit.jupiter.api.Test;

public class fizzbuzzTest {
    void fizzBuzz(int value){
        for (int i = 0 ; i < value ;i++)
        {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    @Test
    void TestFizzBuzz(){
        fizzBuzz(20);
    }
}

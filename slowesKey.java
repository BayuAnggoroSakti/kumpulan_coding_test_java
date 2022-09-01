import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class slowesKey {
    char checkSlowestKey(int[][] keyTimes){
        int maxDiff = keyTimes[0][1];
        char key = (char)(keyTimes[0][0] + 'a');
        int preTime = keyTimes[0][1];
        
        for( int i = 1; i < keyTimes.length; i++ ){
            int diff = keyTimes[i][1] - preTime;

            if( diff > maxDiff ){
                maxDiff = diff;
                key = (char)(keyTimes[i][0] + 'a');
            }
            
            preTime = keyTimes[i][1];
        }
        
        return(key);
    }

    @Test
    void SlwestKeyTest(){
        int keyTimes[][] = {{0,1},{0,3},{4,5},{5,6},{4,10}};
        Assertions.assertEquals('e', checkSlowestKey(keyTimes));
    }
}
